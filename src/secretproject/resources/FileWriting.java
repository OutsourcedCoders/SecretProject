/*
 * Copyright (C) 2016 Jorge A. Flores-Morales
 *
 * This file is part of SecretProject
 *
 * SecretProject is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SecretProject is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SecretProject.  If not, see <http://www.gnu.org/licenses/>.
 */

package secretproject.resources;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import static secretproject.resources.Data.saveLoc;


public class FileWriting {
    private String outputText;
    private String outputFile;
    private String outputDir;
    private String totalPath;
    private boolean fileCreated;
    private boolean folderCreated;
    private boolean folderFail;
    
    public FileWriting(){
    }
    
    public void WriteToFile(String inputText, String inputDir){
        outputText = inputText;
        outputDir  = inputDir;
        while(!fileCreated){
            try{
                if(outputDir.equalsIgnoreCase("ROOTDIR")){
                    totalPath = saveLoc + outputFile + ".txt";
                }else{
                    totalPath = saveLoc + outputDir + "/" + outputFile + ".txt";
                }
                File GameData = new File(totalPath);
                FileOutputStream Output = new FileOutputStream(GameData);
                OutputStreamWriter WriterOut = new OutputStreamWriter(Output);
                Writer FileWrite = new BufferedWriter(WriterOut);
                FileWrite.write(outputText);
                FileWrite.close();
                fileCreated = true;
            }catch(IOException e){
                fileCreated = false;
                DirectoryCreation();
                if(folderFail){
                    break;
                }
            }
        }
    }
    
    private void DirectoryCreation(){
        folderCreated = (new File(saveLoc + outputDir)).mkdirs();
        if (!folderCreated){
            folderFail = true;
            System.err.println("Folder creation failed.");
            System.err.println("Check program priviledges.");
            System.err.println("PS. It also might be dev error :P");
            System.err.print("Press any key to quit.\n> ");
        }
    }
    
    public void ChangeFileName(String inputFile){
        fileCreated = false;
        folderFail = false;
        outputFile = inputFile; 
    }
    
    public void ChangeDirectory(String newDir){
        outputDir = newDir;
    }
}

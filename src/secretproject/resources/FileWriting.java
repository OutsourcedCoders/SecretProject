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


public class FileWriting {
    public String outputText;
    public String outputFile;
    public String outputDir;
    private boolean fileCreated;
    private boolean folderCreated;
    
    public FileWriting(String inputFile){
        outputFile = inputFile;
    }
    
    public void WriteToFile(String inputText, String inputDir){
        outputText = inputText;
        outputDir  = inputDir;
        try{
            File GameData = new File("C:/ProgramData/SBURB_Beta/GameData.txt");
            FileOutputStream Output = new FileOutputStream(GameData);
            OutputStreamWriter WriterOut = new OutputStreamWriter(Output);
            Writer FileWrite = new BufferedWriter(WriterOut);
            FileWrite.write(outputText);
            FileWrite.close();
        }catch(IOException e){
            DirectoryCreation();
        }
    }
    
    private void DirectoryCreation(){
        if(outputDir.equalsIgnoreCase("NODIR")){
            folderCreated = (new File("C:/ProgramData/SBURB_Beta")).mkdirs();
        }else{
            folderCreated = (new File("C:/ProgramData/SBURB_Beta/" + outputDir)).mkdirs();
        }
        if (!folderCreated){
            System.err.println("Folder creation failed.");
            System.err.println("Check program priviledges.");
        }
    }
}

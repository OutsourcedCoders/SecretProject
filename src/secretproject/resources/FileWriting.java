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
    private String textWritten;
    private String fileName;
    private String fileDir;
    private String totalPath;
    private boolean fileCreated;
    private boolean folderCreated;
    private boolean folderFail;
    private boolean devMode;
    
    public FileWriting(){
    }
    
    /**
     * A quick file writer that takes a string as an input, and a
     * directory as an input to create a file with the text chosen.
     * <p>
     * Also uses a private class that creates a directory if there is no
     * existing one. This private class also uses a simple boolean variable
     * choosing whether or not error messages are printed named devMode.
     * 
     * @param newTextWritten Text that is inserted into file.
     * @param newFileDir  Location of file. "/" are only required
     * if it is a directory within a directory.
     * <p>
     * To find out more about devMode,
     * @see ViewableErrors
     */
    public void WriteToFile(String newTextWritten, String newFileDir){
        textWritten = newTextWritten;
        fileDir  = newFileDir;
        while(!fileCreated){
            try{
                if(fileDir.equalsIgnoreCase("ROOTDIR")){
                    totalPath = saveLoc + fileName + ".txt";
                }else{
                    totalPath = saveLoc + fileDir + "/" + fileName + ".txt";
                }
                File GameData = new File(totalPath);
                FileOutputStream Output = new FileOutputStream(GameData);
                OutputStreamWriter WriterOut = new OutputStreamWriter(Output);
                Writer FileWrite = new BufferedWriter(WriterOut);
                FileWrite.write(textWritten);
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
        folderCreated = (new File(saveLoc + fileDir)).mkdirs();
        if (!folderCreated){
            folderFail = true;
            if(devMode){
                System.err.println("Folder creation failed.");
                System.err.println("Check program priviledges.");
                System.err.println("PS. It also might be dev error :P");
                System.err.print("Press any key to quit.\n> ");
            }
            
        }
    }
    
    /**
     * An object function that is used to set the file name.
     * <p>
     * <b>Required for any file to be properly created.</b>
     * 
     * @param newFileName File name chosen for new file.
     */
    public void ChangeFileName(String newFileName){
        fileCreated = false;
        folderFail = false;
        fileName = newFileName; 
    }
    
    /**
     * An object function that changes to a new directory, 
     * specified by the user. 
     * <p>
     * <b>No "/" are required, unless choosing a directory within a directory.</b>
     * 
     * @param newDir
     */
    public void ChangeDirectory(String newDir){
        fileDir = newDir;
    }
    
    /**
     * Enables or disables developer mode, in which error messages are printed.
     * 
     * @param printErrors True means errors are printed. False means errors are 
     * hidden.
     */
    public void ViewableErrors(boolean printErrors){
        devMode = printErrors;
    }
}

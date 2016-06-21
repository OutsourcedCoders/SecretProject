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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static secretproject.resources.Data.saveLoc;

public class FileReading {
    private String fileDir;
    private String fileName;
    private String totalPath;
    private boolean fileRead;
    private boolean devMode;
    
    /**
     * Used to get what was in the last scanned text file without rereading
     * the file.
     * 
     * @see ReadFile
     */
    public String textExtracted;
    
    
    public FileReading(){
    }
    
    /**
     * A quick file reader that changes text files into strings, pulled apart by
     * line. Prints 2 lines if file is not located, and developer mode is enabled.
     * <p>
     * <b>NOTE: Every line is placed in a single string.</b>
     * <p>
     * No parameters required.
     * 
     * @return Returns the text extracted from the file
     * 
     * @see ViewableErrors for enabling developer mode.
     */
    public String ReadFile(){
        while(!fileRead){
            if(fileDir.equalsIgnoreCase("ROOTDIR")){
                totalPath = saveLoc + fileName + ".txt";
            }else{
                totalPath = saveLoc + fileDir + "/" + fileName + ".txt";
            }
            try(BufferedReader br = new BufferedReader(new FileReader(totalPath))) {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while(line != null){
                    sb.append(line);
                    sb.append(System.lineSeparator());
                    line = br.readLine();
                }
                textExtracted = sb.toString();
                fileRead = true;
            }catch(IOException e){
                textExtracted = "";
                if(devMode){
                    System.err.println("File reading failed.");
                    System.err.println("File at " + totalPath + " might not exist.");
                }
                break;
            }
        }
        return textExtracted;
    }
    
    /**
     * Changes to new directory, specified by the user. No "/" are required,
     * unless choosing a directory within a directory.
     *
     * @param newDir is required.
     *
     */
    public void ChangeDirectory(String newDir){
        fileDir = newDir;
        textExtracted = "NULL";
    }
    
    /**
     * Changes to new file, specified by the user. 
     * 
     * Only text files are supported currently.
     * 
     * @param newFileName File extension not required.
     */
    public void ChangeFile(String newFileName){
        fileName = newFileName;
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

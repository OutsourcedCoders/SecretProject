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
    public String textExtracted;
    
    public FileReading(){
    }
    
    public void ReadFile(){
        while(!fileRead){
            if(fileDir.equalsIgnoreCase("ROOTDIR")){
                totalPath = saveLoc + fileDir + fileName + ".txt";
            }else{
                totalPath = saveLoc + fileName + ".txt";
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
            }catch(IOException e){
                fileRead = false;
                System.err.println("File reading failed.");
                System.err.println("File at " + totalPath + " might not exist.");
            }
        }
    }
    
    public void ChangeDirectory(String newDir){
        fileDir = newDir;
        textExtracted = "NULL";
    }
    
    public void ChangeFile(String newFileName){
        fileName = newFileName;
    }
    //PLZ IGNORE NEXT LINES...
    
//    public static void ReadFile() throws IOException{
//        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//        try {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//
//            while (line != null){
//                sb.append(line);
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//            }
//            String everything = sb.toString();
//        }finally{
//            br.close();
//        }   
//    }
}

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

/**
 *
 * @author Jorge
 */
public class FileReading {
    private String fileDir;
    private String fileName;
    private String totalPath;
    public String outputText;
    
    public FileReading(String inputDir, String inputFileName){
        fileDir = inputDir;
        fileName = fileDir;
    }
    
    public void ReadFile() throws IOException{
        if(fileDir.equalsIgnoreCase("NULL")){
            totalPath = saveLoc + fileDir + fileName + ".txt";
        }else{
            totalPath = saveLoc + fileName + ".txt";
        }
        BufferedReader br = new BufferedReader(new FileReader(totalPath));
        try{
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while(line != null){
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            outputText = sb.toString();
        }finally{
            br.close();
        }
    }
    
    public void ChangeDirectory(String inputDir){
        fileDir = inputDir;
        outputText = "NULL";
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

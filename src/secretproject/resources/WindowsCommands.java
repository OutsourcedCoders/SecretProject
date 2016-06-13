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

public class WindowsCommands{
    //clears screen
    public static void CLS(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void Writing(){
        try{
            File GameData = new File("C:/ProgramData/SBURB_Beta/GameData.txt");
            FileOutputStream Output = new FileOutputStream(GameData);
            OutputStreamWriter WriterOut = new OutputStreamWriter(Output);
            Writer FileWrite = new BufferedWriter(WriterOut);
            FileWrite.write("Test?");
            FileWrite.close();
        }catch(IOException e){
            System.err.println("Failed to write to file!!!");
        }
    }
}
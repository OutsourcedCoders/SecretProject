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

package secretproject;

import static secretproject.resources.Data.*;
import static secretproject.resources.WindowsCommands.ClearScreen;

public class NewRuntime {
    public static void NewMain(){
        secretproject.screens.MainScreens.SburbPreAlpha();
        sc.nextLine();
        
        fr.ChangeDirectory("savedata");
        fr.ChangeFile("name");
        
        savedataExists = !(fr.ReadFile().isEmpty());
        
        if(savedataExists){
            System.out.println("Would you like to load your account?");
            while(!userAnswered){
                System.out.print("> ");
                userInput = sc.nextLine();
                switch(userInput.toUpperCase()){
                    case "Y":
                    case "YES":
                        userAnswered = true;
                        loadedData = true;
                        plrNameC = fr.textExtracted;
                        fr.ChangeFile("password");
                        fr.ReadFile();
                        plrPswdC = fr.textExtracted;
                        System.out.println("Your player name was " + plrNameC);
                        break;
                    case "N":
                    case "NO":
                        userAnswered = true;
                        loadedData = false;
                        break;
                    default:
                        System.out.println("Please choose yes/no or y/n.");
                }
            }
        }else{
            loadedData = false;
        }
        ClearInputs();
        ClearOutputs();
        ClearScreen();
        
        if(!loadedData){
            System.out.print("Choose a name.\n>");
            userInput = sc.nextLine();
            plrNameC = userInput;
            fw.ChangeDirectory("savedata");
            fw.ChangeFileName("name");
            fw.WriteToFile(plrNameC);
            
            ClearInputs();
            ClearScreen();
            
            System.out.println("Enter a password.");
            userInput = sc.nextLine();
            plrPswdC = userInput;
            fw.ChangeFileName("password");
            fw.WriteToFile(plrPswdC);
        }
        
        ClearInputs();
        ClearOutputs();
        ClearScreen();
        
        secretproject.screens.MainScreens.StartMenu();
        if(userAnswered){
            
        }
    }
}

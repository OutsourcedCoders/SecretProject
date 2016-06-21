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
import secretproject.resources.FileWriting;

public class OldRuntime {
    public static void OldMain(){
        
        //secretproject.resources.WindowsCommands.ClearScreen();
        
        FileWriting fw = new FileWriting();
        fw.ChangeFileName("water");
        fw.WriteToFile("Did it work?", "resources");
        
        System.out.print("Enter NAME.\n> ");
        plrNameC = sc.nextLine();
        fw.ChangeFileName("name");
        fw.WriteToFile(plrNameC, "savedata");
        //FileWriting name = new FileWriting("name");
        //name.WriteToFile(plrNameC, "savedata");
        
        System.out.println("NAME CREATION sucessful.");
        int loginTries;
        System.out.print("PASSWORD CREATION.\n> ");
        plrPswdC = sc.nextLine();
        secretproject.resources.WindowsCommands.ClearScreen();
        if(plrPswdC.contains(" ")){
            System.out.println("NO SPACES");
            System.out.println("GOODBYE");
        }else{
            fw.ChangeFileName("password");
            fw.WriteToFile(plrPswdC, "savedata");
            System.out.println("PASSWORD CREATION sucessful.");
            for(loginTries = 0; loginTries <= 5; loginTries++){
                System.out.print("Enter your PASSWORD.\n> ");
                if(sc.nextLine().equals(plrPswdC)){
                    secretproject.resources.WindowsCommands.ClearScreen();
                    System.out.println("Login sucessful.");
                    break;
                }else{
                    secretproject.resources.WindowsCommands.ClearScreen();
                    System.out.println("Login unsucessful.");
                    System.out.println("Try again.");
                }
            }
            secretproject.resources.WindowsCommands.ClearScreen();
            System.out.println("SBURB version 0.0.0.1\n");
            System.out.println("SKIANET SYSTEMS INCORPORATED. ALL RIGHTS RESERVED.\n");
            System.out.println("SBURB client is running.\n");
            System.out.println("Press [ENTER] when ready.\n");
            System.out.print("> ");
            sc.nextLine();
            userAnswered = false;
            while(!userAnswered){
                System.out.println("---MENU---");
                System.out.println("\tCREATE CHARACTER.");
                System.out.println("\tQUIT.");
                userInput = sc.nextLine();
                switch(userInput.toUpperCase()){
                    case "CREATE CHARACTER":
                        userAnswered = true;
                        break;
                    case "QUIT":
                        secretproject.resources.WindowsCommands.ClearScreen();
                        System.out.print("\n SBURB client shutting down...");
                        return;
                }
            }
            userAnswered = false;
            while(!playerCreated) {
                secretproject.resources.WindowsCommands.ClearScreen();
                userInput = sc.nextLine();
                System.out.println("PLAYER CREATION running.\n");
                while (!userAnswered) {
                    System.out.print("RANDOM or CUSTOM?\n> ");
                    userInput = sc.nextLine();
                    switch (userInput.toUpperCase()) {
                        case "RANDOM":
                            userInput = sc.nextLine();
                            switch(userInput.toUpperCase()){
                                case "YES":
                                    break;
                                case "NO":
                                    break;
                                default:
                                    System.out.println("Not a valid option");
                                    return;
                            }
                            System.out.println("RANDOM GEN CHOSEN\n");
                            randomChar = true;
                            userAnswered = true;
                            break;
                        case "CUSTOM":
                            System.out.println("CUSTOM NOT FUNCTIONAL\n");
                            //transition to default...
                        default:
                            System.out.println("Choose \'RANDOM\' or");
                            System.out.println("\'CUSTOM\'.");
                            break;
                    }
                }
                userAnswered = false;
                if(randomChar){
                    secretproject.resources.WindowsCommands.ClearScreen();
                    secretproject.player.PlayerCreation.RandomChar();
                    secretproject.player.PlayerCreation.classpectGen();
                    secretproject.lands.LandMain.landGen();
                    playerCreated = true;
                }else{
                    System.out.println("UNFINISHED.");
                    System.out.println("¯\\_(ツ)_/¯");
                    return;
                }
            }
            System.out.print("\nPress [ENTER] when ready.\n>");
            sc.nextLine();
            System.out.println("Game starting.\n");
            gameStarted = true;
            while(gameStarted){
                System.out.println("You, " + plrNameC + "");
                gameStarted = false;
            }
        }
    }
}

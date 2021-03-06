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

package secretproject.screens;

import static secretproject.resources.Data.*;

public class MainScreens {
    public static void SburbPreAlpha(){
        secretproject.resources.WindowsCommands.ClearScreen();
        System.out.println("SBURB version 0.0.0.1\n");
        System.out.println("SKIANET SYSTEMS INCORPORATED. ALL RIGHTS RESERVED.\n");
        System.out.println("SBURB client is running.\n");
        System.out.println("Press [ENTER] when ready.\n");
        System.out.print("> ");
    }
    
    public static void StartMenu(){
        while(!userAnswered){
            System.out.println("---MENU---");
            System.out.println("1.\tCREATE CHARACTER.");
            System.out.println("2.\tQUIT.");
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "1":
                case "CREATE CHARACTER":
                    userAnswered = true;
                    break;
                case "2":
                case "QUIT":
                    secretproject.resources.WindowsCommands.ClearScreen();
                    System.out.print("\n SBURB client shutting down...");
                    return;
            }
        }
    }
    
    
}

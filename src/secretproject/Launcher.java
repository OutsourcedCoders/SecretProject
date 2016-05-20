/*
 * Copyright (C) 2016 Jorge A. Flores-Morales
 *
 * This is the main class of SecretProject
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

public class Launcher {

    public static void main(String[] args) {
        secretproject.resources.Data.ClearScreen();
        System.out.println("SBURB version 0.0.0.1\n");
        System.out.println("SKIANET SYSTEMS INCORPORATED. ALL RIGHTS RESERVED.\n");
        System.out.println("SBURB client is running.\n");
        System.out.println("Start? Type yes or no, press [ENTER] when ready.\n");
        System.out.print("> ");
        while(!userAnswered){
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "YES":
                    secretproject.resources.Data.ClearScreen();
                    System.out.println("SBURB character creation is running.\n");
                    break;
                case "NO":
                    System.out.println("PROGRAM TERMINATING.\n");
                    return;
            }
            System.out.print("RANDOM or CUSTOM?\n> ");
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "RANDOM":
                    System.out.println("RANDOM GEN CHOSEN\n");
                    randomChar = true;
                    userAnswered = true;
                    break;
                case "CUSTOM":
                    System.out.println("CUSTOM NOT FUNCTIONAL");
                    break;
                default:
                    System.out.println("Choose \'RANDOM\' or");
                    System.out.println("\'CUSTOM\'.");
            }
            if(randomChar){
                secretproject.resources.Data.ClearScreen();
                secretproject.player.PlayerCreation.RandomChar();
                secretproject.player.Aspect.classpectGen();
            }else{
                System.out.println("UNFINISHED.");
                System.out.println("¯\\_(ツ)_/¯");
                return;
            }
            
        }
    }
    
}

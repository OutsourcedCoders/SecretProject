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
//boop

import static secretproject.resources.Data.*;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("SBURB version 0.0.1\n");
        System.out.println("SKIANET SYSTEMS INCORPORATED. ALL RIGHTS RESERVED.\n");
        System.out.println("SBURB client is running.\n");
        System.out.println("Start? Type yes or no, press [ENTER] when ready.\n");
        System.out.print("\n>");
        while(!userAnswered){
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "YES":
                    System.out.println("Alright.");
                    break;
                case "NO":
                    System.out.println("Whelp, goodbye then.");
                    return;
            }
            System.out.print("Random character or custom?\n:");
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "RANDOM":
                    System.out.println("Have fun *wonk*\n");
                    randomChar = true;
                    userAnswered = true;
                    break;
                case "CUSTOM":
                    System.out.println("Great, lets get started!");
                    break;
                default:
                    System.out.println("Please choose \'Random\' or");
                    System.out.println("\'Custom\'.");
                    System.out.println("Not case sensitive.");
            }
            if(randomChar){
                secretproject.player.PlayerCreation.RandomChar();
            }else{
                System.out.println("Not done yet.");
                System.out.println("¯\\_(ツ)_/¯");
                return;
            }
            
        }
    }
    
}

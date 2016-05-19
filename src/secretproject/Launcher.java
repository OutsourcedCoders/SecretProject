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
        System.out.println("So, you've encontered this random program.");
        System.out.println("Well, you've better have good reason to be here.");
        System.out.print("Want to start?\n:");
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
                case "RANDOM CHARACTER":
                    System.out.println("Have fun *wonk*");
                    randomChar = true;
                    break;
                case "CUSTOM CHARACTER":
                    System.out.println("Great, lets get started!");
                    break;
                default:
                    System.out.println("Please choose \'Random Character\' or");
                    System.out.println("\'Custom Character\'.");
                    System.out.println("Not case sensitive.");
            }
            if(randomChar){
                
            }else{
                
            }
        }
    }
    
}

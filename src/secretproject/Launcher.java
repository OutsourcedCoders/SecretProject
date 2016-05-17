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
        System.out.println("So, you've encontered this random program.");
        System.out.println("Well, you've better have good reason to be here.");
        System.out.println("Want to start?");
        while(!userAnswered){
            userInput = sc.nextLine();
            switch(userInput.toUpperCase()){
                case "YES":
                    System.out.println("Alright.");
                    break;
                case "NO":
                    System.out.println("Whelp,");
            }
        }
    }
    
}

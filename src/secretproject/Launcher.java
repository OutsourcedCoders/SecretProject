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
        secretproject.resources.WindowsCommands.ClearScreen();
        System.out.println("Choose Version...");
        System.out.println("1.\tOld Main (stable but unfinished)");
        System.out.println("2.\tNew Main (super unstable)");
        userInput = sc.nextLine();
        while(!userAnswered){
            switch(userInput.toUpperCase()){
                case "1":
                case "OLD":
                case "OLD MAIN":
                    System.out.println("You chose stable branch.");
                    userAnswered = true;
                    break;
                case "2":
                case "NEW":
                case "NEW MAIN":
                    System.out.println("You chose unstable branch.");
                    stable = false;
                    userAnswered = true;
                    break;
                default:
                    System.out.println("Please choose a valid answer.");
                    break;
            }
        }
        System.out.println("Launching...");
        if(stable){
            secretproject.OldRuntime.OldMain();
        }else{
            secretproject.NewRuntime.NewMain();
        }
    }
}

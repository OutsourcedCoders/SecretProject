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

public class NewRuntime {
    public static void NewMain(){
        
        
        
        secretproject.screens.MainScreens.SburbPreAlpha();
        sc.nextLine();
        
        fr.ChangeDirectory("savedata");
        fr.ChangeFile("name");
        fr.ReadFile();
        savedataExists = !(fr.textExtracted.isEmpty());
        
        if(savedataExists){
            System.out.println("Would you like to load your account?");
            while(!userAnswered){
                
            }
        }
    }
}

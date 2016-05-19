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

package secretproject.player;

import static secretproject.resources.Data.*;

public class Aspect {
    public void classpectGen(){
        playerClass = rng.nextInt(6);
        playerAspect = rng.nextInt(11);
        if(playerGender == 1){
            switch(playerClass){
                case 0:
                    playerClassC = "Rogue";
                    break;
                case 1:
                    playerClassC = "Heir";
                    break;
                case 2:
                    playerClassC = "Thief";
                    break;
                case 3:
                    playerClassC = "Rogue";
                    break;
                case 4:
                    playerClassC = "Rogue";
                    break;
                case 5:
                    playerClassC = "Rogue";
                    break;
                case 6:
                    playerClassC = "Rogue";
                    break;
            }
        }else{
            switch(playerClass){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
        
    }
}

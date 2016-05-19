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

public class PlayerCreation {
    public static void RandomChar(){
        playerGender = rng.nextInt(1);
        playerHair = rng.nextInt(9);
        playerClothes = rng.nextInt(9);
        switch(playerGender){
            case 0:
                playerGenderC = "Male";
                break;
            case 1:
                playerGenderC = "Female";
                break;
        }
        
        switch(playerHair){
            case 0:
                playerHairC = "curly";
                break;
            case 1:
                playerHairC = "straight down";
                break;
            case 2:
                playerHairC = "mohawk";
                break;
            case 3:
                playerHairC = "bedhead";
                break;
            case 4:
                playerHairC = "cropped";
                break;
            case 5:
                playerHairC = "millitary";
                break;
            case 6:
                playerHairC = "long";
                break;
            case 7:
                playerHairC = "short";
                break;
            case 8:
                playerHairC = "unsettled";
                break;
            case 9:
                playerHairC = "standing up";
                break;
        }
        if(playerGender == 1){
            switch (playerClothes){
                case 0:
                    playerClothesC = "green skirt with light green blouse";
                    break;
                case 1:
                    playerClothesC = "long red shirt with black leggings";
                    break;
                case 2:
                    playerClothesC = "<placeholder>";
                    break;
                case 3:
                    playerClothesC = "<placeholder>";
                    break;
                case 4:
                    playerClothesC = "<placeholder>";
                    break;
                case 5:
                    playerClothesC = "<placeholder>";
                    break;
                case 6:
                    playerClothesC = "<placeholder>";
                    break;
                case 7:
                    playerClothesC = "<placeholder>";
                    break;
                case 8:
                    playerClothesC = "<placeholder>";
                    break;
                case 9:
                    playerClothesC = "<placeholder>";
                    break;
            }
        }else if (playerGender == 0){
            switch (playerClothes){
                case 0:
                    playerClothesC = "jeans with t-shirt";
                    break;
                case 1:
                    playerClothesC = "<placeholder>";
                    break;
                case 2:
                    playerClothesC = "<placeholder>";
                    break;
                case 3:
                    playerClothesC = "<placeholder>";
                    break;
                case 4:
                    playerClothesC = "<placeholder>";
                    break;
                case 5:
                    playerClothesC = "<placeholder>";
                    break;
                case 6:
                    playerClothesC = "<placeholder>";
                    break;
                case 7:
                    playerClothesC = "<placeholder>";
                    break;
                case 8:
                    playerClothesC = "<placeholder>";
                    break;
                case 9:
                    playerClothesC = "<placeholder>";
                    break;
            }
        }
        System.out.println("RANDOM PLAYER generated.\n");
        System.out.println("RANDOM PLAYER loaded.\n");
        System.out.println("Gender  = " + playerGenderC);
        System.out.println("Hair    = " + playerHairC);
        System.out.println("Clothes = " + playerClothesC);
    }
}

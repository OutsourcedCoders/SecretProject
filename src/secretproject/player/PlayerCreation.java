/*
 * Copyright (C) 2016 Jorge A. Flores-Morales, Andy Zheng
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
        playerGender = rng.nextBoolean();
        playerHair = rng.nextInt(9);
        playerClothes = rng.nextInt(9);
        if(!playerGender){
            playerGenderC = "male";
        }else{
            playerGenderC = "female";
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
                playerHairC = "bedhead";
                break;
        }
        if(!playerGender){
            switch (playerClothes){
                case 0:
                    playerClothesC = "jeans with green t-shirt";
                    break;
                case 1:
                    playerClothesC = "zipped hoodie with jeans";
                    break;
                case 2:
                    playerClothesC = "";
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
        }else{
            switch (playerClothes){
                case 0:
                    playerClothesC = "green skirt with light green blouse";
                    break;
                case 1:
                    playerClothesC = "long red skirt with black leggings";
                    break;
                case 2:
                    playerClothesC = "fancy labcoat";
                    break;
                case 3:
                    playerClothesC = "ripped jeans with purple blouse";
                    break;
                case 4:
                    playerClothesC = "atom t-shirt with long skirt";
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
    
    public static void classpectGen(){
        playerClass = rng.nextInt(8);
        playerAspect = rng.nextInt(11);
        /*
         Classes possible.
         Rogue  F M
         Thief  F M
         Heir   F M
         Maid   F
         Page     M
         Knight F M
         Seer   F M
         Mage   F M
         Sylph  F
         Witch  F
         Bard     M
         Prince   M
         */
        if(!playerGender){
            switch(playerClass){
                case 0:
                    playerClassC = "Rogue";
                    break;
                case 1:
                    playerClassC = "Thief";
                    break;
                case 2:
                    playerClassC = "Heir";
                    break;
                case 3:
                    playerClassC = "Page";
                    break;
                case 4:
                    playerClassC = "Knight";
                    break;
                case 5:
                    playerClassC = "Seer";
                    break;
                case 6:
                    playerClassC = "Mage";
                    break;
                case 7:
                    playerClassC = "Bard";
                    break;
                case 8:
                    playerClassC = "Prince";
                    break;
            }
        }else{
            switch(playerClass){
                case 0:
                    playerClassC = "Rogue";
                    break;
                case 1:
                    playerClassC = "Thief";
                    break;
                case 2:
                    playerClassC = "Heir";
                    break;
                case 3:
                    playerClassC = "Maid";
                    break;
                case 4:
                    playerClassC = "Knight";
                    break;
                case 5:
                    playerClassC = "Seer";
                    break;
                case 6:
                    playerClassC = "Mage";
                    break;
                case 7:
                    playerClassC = "Sylph";
                    break;
                case 8:
                    playerClassC = "Witch";
                    break;
            }
        }
        /*
        Possible aspects
        Time
        Space
        Void
        Light
        Mind
        Heart
        Rage
        Hope
        Doom
        Life
        Blood
        Breath
        */
        switch(playerAspect){
            case 0:
                playerAspectC = "Time";
                break;
            case 1:
                playerAspectC = "Space";
                break;
            case 2:
                playerAspectC = "Void";
                break;
            case 3:
                playerAspectC = "Light";
                break;
            case 4:
                playerAspectC = "Mind";
                break;
            case 5:
                playerAspectC = "Heart";
                break;
            case 6:
                playerAspectC = "Rage";
                break;
            case 7:
                playerAspectC = "Hope";
                break;
            case 8:
                playerAspectC = "Doom";
                break;
            case 9:
                playerAspectC = "Life";
                break;
            case 10:
                playerAspectC = "Blood";
                break;
            case 11:
                playerAspectC = "Breath";
                break;
        }
        System.out.println("ROLE = " + playerClassC + " of " + playerAspectC);
    }
}

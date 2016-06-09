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
        playerGender = rnGsus.nextBoolean();
        genName = rnGsus.nextInt(10);
        genHair = rnGsus.nextInt(10);
        genClothes = rnGsus.nextInt(10);
        if(!playerGender){
            plrGenderC = "male";
        }else{
            plrGenderC = "female";
        }
        
        switch(genHair){
            case 0:
                plrHairC = "curly";
                break;
            case 1:
                plrHairC = "straight down";
                break;
            case 2:
                plrHairC = "mohawk";
                break;
            case 3:
                plrHairC = "bedhead";
                break;
            case 4:
                plrHairC = "cropped";
                break;
            case 5:
                plrHairC = "millitary";
                break;
            case 6:
                plrHairC = "long";
                break;
            case 7:
                plrHairC = "short";
                break;
            case 8:
                plrHairC = "unsettled";
                break;
            case 9:
                plrHairC = "bedhead";
                break;
        }
        if(!playerGender){
            switch (genClothes){
                case 0:
                    plrClothesC = "jeans with green t-shirt";
                    break;
                case 1:
                    plrClothesC = "zipped hoodie with jeans";
                    break;
                case 2:
                    plrClothesC = "SBurb shirt with jeans";
                    break;
                case 3:
                    plrClothesC = "white t-shirt with shorts";
                    break;
                case 4:
                    plrClothesC = "cargo pants with long sleeve shirt";
                    break;
                case 5:
                    plrClothesC = "leather trenchcoat";
                    break;
                case 6:
                    plrClothesC = "labcoat with pants";
                    break;
                case 7:
                    plrClothesC = "<placeholder>";
                    break;
                case 8:
                    plrClothesC = "<placeholder>";
                    break;
                case 9:
                    plrClothesC = "<placeholder>";
                    break;
            }
        }else{
            switch (genClothes){
                case 0:
                    plrClothesC = "green skirt with light green blouse";
                    break;
                case 1:
                    plrClothesC = "long red skirt with black leggings";
                    break;
                case 2:
                    plrClothesC = "labcoat with leggings";
                    break;
                case 3:
                    plrClothesC = "ripped jeans with purple blouse";
                    break;
                case 4:
                    plrClothesC = "atom t-shirt with long skirt";
                    break;
                case 5:
                    plrClothesC = "purple skirt with jacket";
                    break;
                case 6:
                    plrClothesC = "SBurb shirt with jeans";
                    break;
                case 7:
                    plrClothesC = "";
                    break;
                case 8:
                    plrClothesC = "<placeholder>";
                    break;
                case 9:
                    plrClothesC = "<placeholder>";
                    break;
            }
        }
        
        System.out.println("RANDOM PLAYER generated.\n");
        System.out.println("RANDOM PLAYER loaded.\n");
        System.out.println("Gender  = " + plrGenderC);
        System.out.println("Hair    = " + plrHairC);
        System.out.println("Clothes = " + plrClothesC);
    }
    
    public static void classpectGen(){
        genClass = rnGsus.nextInt(9);//returns number from 0-8
        genAspect = rnGsus.nextInt(12);//returnss number from 0-11
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
            switch(genClass){
                case 0:
                    plrClassC = "Rogue";
                    break;
                case 1:
                    plrClassC = "Thief";
                    break;
                case 2:
                    plrClassC = "Heir";
                    break;
                case 3:
                    plrClassC = "Page";
                    break;
                case 4:
                    plrClassC = "Knight";
                    break;
                case 5:
                    plrClassC = "Seer";
                    break;
                case 6:
                    plrClassC = "Mage";
                    break;
                case 7:
                    plrClassC = "Bard";
                    break;
                case 8:
                    plrClassC = "Prince";
                    break;
            }
        }else{
            switch(genClass){
                case 0:
                    plrClassC = "Rogue";
                    break;
                case 1:
                    plrClassC = "Thief";
                    break;
                case 2:
                    plrClassC = "Heir";
                    break;
                case 3:
                    plrClassC = "Maid";
                    break;
                case 4:
                    plrClassC = "Knight";
                    break;
                case 5:
                    plrClassC = "Seer";
                    break;
                case 6:
                    plrClassC = "Mage";
                    break;
                case 7:
                    plrClassC = "Sylph";
                    break;
                case 8:
                    plrClassC = "Witch";
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
        switch(genAspect){
            case 0:
                plrAspectC = "Time";
                break;
            case 1:
                plrAspectC = "Space";
                break;
            case 2:
                plrAspectC = "Void";
                break;
            case 3:
                plrAspectC = "Light";
                break;
            case 4:
                plrAspectC = "Mind";
                break;
            case 5:
                plrAspectC = "Heart";
                break;
            case 6:
                plrAspectC = "Rage";
                break;
            case 7:
                plrAspectC = "Hope";
                break;
            case 8:
                plrAspectC = "Doom";
                break;
            case 9:
                plrAspectC = "Life";
                break;
            case 10:
                plrAspectC = "Blood";
                break;
            case 11:
                plrAspectC = "Breath";
                break;
        }
        System.out.println("ROLE = " + plrClassC + " of " + plrAspectC);
    }
}

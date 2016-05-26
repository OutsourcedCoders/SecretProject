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

package secretproject.lands;

import static secretproject.resources.Data.*;

public class LandMain {
    public void LandDesc(){
        switch(land1){
            
        }
        switch(land2){
            
        }
    }
    
    public void landGen(){
        landRand = rnGsus.nextInt(4);
        /*
         Rogue planets possible  :
            
         Thief planets possible  :
            
         Heir planets possible   :
            
         Maid planets possible   :
            
         Page planets possible   :
            
         Knight planets possible :
            
         Seer planets possible   :
            
         Mage planets possible   :
            
         Sylph planets possible  :
            
         Witch planets possible  :
            
         Bard planets possible   :
             
         Prince planets possible :
            
        */
        switch(playerClassC.toUpperCase()){
            case "ROGUE":
                break;
            case "THIEF":
                break;
            case "HEIR":
                break;
            case "MAID":
                break;
            case "PAGE":
                break;
            case "KNIGHT":
                break;
            case "SEER":
                break;
            case "MAGE":
                break;
            case "SYLPH":
                break;
            case "WITCH":
                break;
            case "BARD":
                break;
            case "PRINCE":
                break;
        }
        /*
         Time planets possible   :
            Clockwork Melody Music 
         Space planets possible  :
            Frogs (ALWAYS HAVE TO BE STOKERS OF THE FORGE)
         Void planets possible   :
            Silence Nothing Holes Caves
         Light planets possible  :
            Colors Rainbows Rain 
         Mind planets possible   :
            Flow Dreams Fears 
         Heart planets possible  :
            Souls Refugees 
         Rage planets possible   :
            Clowns Destruction Craziness 
         Hope planets possible   :
            Angels Bells Fields Flowers
         Doom planets possible   :
            Death Ruins Shelters Fire
         Life planets possible   :
            Forest Ferns Roses Monsters
         Blood planets possible  :
            Pulse Wine 
         Breath planets possible :
            Shade Zephyr Breeze Storms
        */
        switch(playerAspectC.toUpperCase()){
            case "TIME":
                switch(landRand){
                    case 0:
                        land2C = "Clockwork";
                        break;
                    case 1:
                        land2C = "Melody";
                        break;
                    case 2:
                        land2C = "Music";
                        break;
                    case 3:
                        land2C = "";
                        break;
                }
                break;
            case "SPACE":
                land2C = "Frogs";
                break;
            case "VOID":
                switch(landRand){
                    case 0:
                        land2C = "Silence";
                        break;
                    case 1:
                        land2C = "Nothing";
                        break;
                    case 2:
                        land2C = "Holes";
                        break;
                    case 3:
                        land2C = "Caves";
                        break;
                }
                break;
            case "LIGHT":
                switch(landRand){
                    case 0:
                        land2C = "Colors";
                        break;
                    case 1:
                        land2C = "Rainbows";
                        break;
                    case 2:
                        land2C = "Rain";
                        break;
                    case 3:
                        land2C = "";
                        break;
                }
                break;
            case "MIND":
                switch(landRand){
                    case 0:
                        land2C = "Flow";
                        break;
                    case 1:
                        land2C = "Dreams";
                        break;
                    case 2:
                        land2C = "Fears";
                        break;
                    case 3:
                        land2C = "";
                        break;
                }
                break;
            case "HEART":
                switch(landRand){
                    case 0:
                        land2C = "Souls";
                        break;
                    case 1:
                        land2C = "Refugees";
                        break;
                    case 2:
                        land2C = "";
                        break;
                    case 3:
                        land2C = "";
                        break;
                }
                break;
            case "RAGE":
                switch(landRand){
                    case 0:
                        land2C = "Clowns";
                        break;
                    case 1:
                        land2C = "Destruction";
                        break;
                    case 2:
                        land2C = "Craziness";
                        break;
                    case 3:
                        land2C = "";
                        break;
                }
                break;
            case "HOPE":
                switch(landRand){
                    case 0:
                        land2C = "Angels";
                        break;
                    case 1:
                        land2C = "Bells";
                        break;
                    case 2:
                        land2C = "Flowers";
                        break;
                    case 3:
                        land2C = "Fields";
                        break;
                }
                break;
            case "DOOM":
                switch(landRand){
                    case 0:
                        land2C = "";
                        break;
                    case 1:
                        land2C = "";
                        break;
                    case 2:
                        land2C = "";
                        break;
                    case 3:
                        land2C = "";
                        break;
                }
                break;
            case "LIFE":
                switch(landRand){
                    case 0:
                        land2C = "";
                        break;
                    case 1:
                        land2C = "";
                        break;
                    case 2:
                        land2C = "";
                        break;
                    case 3:
                        land2C = "";
                        break;
                }
                break;
            case "BLOOD":
                switch(landRand){
                    case 0:
                        land2C = "";
                        break;
                    case 1:
                        land2C = "";
                        break;
                    case 2:
                        land2C = "";
                        break;
                    case 3:
                        land2C = "";
                        break;
                }
                break;
            case "BREATH":
                switch(landRand){
                    case 0:
                        land2C = "";
                        break;
                    case 1:
                        land2C = "";
                        break;
                    case 2:
                        land2C = "";
                        break;
                    case 3:
                        land2C = "";
                        break;
                }
                break;
        }
    }
}

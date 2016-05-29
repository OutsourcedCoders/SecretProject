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
    public static void LandDesc(){
        switch(genLand1){
            
        }
        switch(genLand2){
            
        }
    }
    
    public static void landGen(){
        landRand = rnGsus.nextInt(4);
        /*
         Rogue planets possible  :
            Treasure
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
        switch(plrClassC.toUpperCase()){
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
            Clockwork Melody Music Tempo
         Space planets possible  :
            Frogs (ALWAYS HAVE TO BE STOKERS OF THE FORGE)
         Void planets possible   :
            Silence Nothing Holes Caves
         Light planets possible  :
            Colors Rainbows Rain Future
         Mind planets possible   :
            Flow Dreams Fears Thought
         Heart planets possible  :
            Souls Refugees Ghosts 
         Rage planets possible   :
            Clowns Destruction Craziness Mirth
         Hope planets possible   :
            Angels Bells Fields Flowers
         Doom planets possible   :
            Death Ruins Shelters Fire
         Life planets possible   :
            Forest Ferns Roses Monsters
         Blood planets possible  :
            Pulse Wine Haze 
         Breath planets possible :
            Shade Zephyr Breeze Storms
        */
        switch(plrAspectC.toUpperCase()){
            case "TIME":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Clockwork";
                        break;
                    case 1:
                        PlrLand2C = "Melody";
                        break;
                    case 2:
                        PlrLand2C = "Music";
                        break;
                    case 3:
                        PlrLand2C = "";
                        break;
                }
                break;
            case "SPACE":
                PlrLand2C = "Frogs";
                break;
            case "VOID":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Silence";
                        break;
                    case 1:
                        PlrLand2C = "Nothing";
                        break;
                    case 2:
                        PlrLand2C = "Holes";
                        break;
                    case 3:
                        PlrLand2C = "Caves";
                        break;
                }
                break;
            case "LIGHT":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Colors";
                        break;
                    case 1:
                        PlrLand2C = "Rainbows";
                        break;
                    case 2:
                        PlrLand2C = "Rain";
                        break;
                    case 3:
                        PlrLand2C = "Light";
                        break;
                }
                break;
            case "MIND":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Flow";
                        break;
                    case 1:
                        PlrLand2C = "Dreams";
                        break;
                    case 2:
                        PlrLand2C = "Fears";
                        break;
                    case 3:
                        PlrLand2C = "Thought";
                        break;
                }
                break;
            case "HEART":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Souls";
                        break;
                    case 1:
                        PlrLand2C = "Refugees";
                        break;
                    case 2:
                        PlrLand2C = "";
                        break;
                    case 3:
                        PlrLand2C = "";
                        break;
                }
                break;
            case "RAGE":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Clowns";
                        break;
                    case 1:
                        PlrLand2C = "Destruction";
                        break;
                    case 2:
                        PlrLand2C = "Craziness";
                        break;
                    case 3:
                        PlrLand2C = "Mirth";
                        break;
                }
                break;
            case "HOPE":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Angels";
                        break;
                    case 1:
                        PlrLand2C = "Bells";
                        break;
                    case 2:
                        PlrLand2C = "Flowers";
                        break;
                    case 3:
                        PlrLand2C = "Fields";
                        break;
                }
                break;
            case "DOOM":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Death";
                        break;
                    case 1:
                        PlrLand2C = "Ruins";
                        break;
                    case 2:
                        PlrLand2C = "Shelters";
                        break;
                    case 3:
                        PlrLand2C = "Fires";
                        break;
                }
                break;
            case "LIFE":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Forest";
                        break;
                    case 1:
                        PlrLand2C = "Ferns";
                        break;
                    case 2:
                        PlrLand2C = "Roses";
                        break;
                    case 3:
                        PlrLand2C = "Monsters";
                        break;
                }
                break;
            case "BLOOD":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Haze";
                        break;
                    case 1:
                        PlrLand2C = "Wine";
                        break;
                    case 2:
                        PlrLand2C = "Pulse";
                        break;
                    case 3:
                        PlrLand2C = "";
                        break;
                }
                break;
            case "BREATH":
                switch(landRand){
                    case 0:
                        PlrLand2C = "Shade";
                        break;
                    case 1:
                        PlrLand2C = "Zephyr";
                        break;
                    case 2:
                        PlrLand2C = "Breeze";
                        break;
                    case 3:
                        PlrLand2C = "Storms";
                        break;
                }
                break;
        }
        System.out.println("LAND = Land of " + PlrLand1C + " and " + PlrLand2C);
    }
}

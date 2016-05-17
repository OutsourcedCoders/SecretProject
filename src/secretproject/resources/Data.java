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

package secretproject.resources;

import java.util.Scanner;
import java.util.Random;

public class Data {
    public static Scanner sc = new Scanner(System.in);
    public static Random rng = new Random();
    
    public static boolean userAnswered = false;
    public static boolean gameEnded = false;
    public static boolean randomChar = false;
    
    public static String userInput;
    public static String land1S = "NULL";
    public static String land2S = "NULL";
    public static String playerGenderC = "NULL";
    public static String playerHairC = "NULL";
    public static String playerClothesC = "NULL";
    
    public static int land1 = 0;
    public static int land2 = 0;
    public static int playerGender;
    public static int playerHair;
    public static int playerClothes;
    
}

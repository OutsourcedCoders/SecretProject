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
import java.text.DecimalFormat;

public class Data {
    //simple objects
    public static Scanner sc = new Scanner(System.in);
    public static Random rnGsus = new Random();
    public static DecimalFormat dc = new DecimalFormat();
    
    //custom objects
    public static FileWriting fw = new FileWriting();
    public static FileReading fr = new FileReading();
    
    //status bools
    public static boolean userAnswered = false;
    public static boolean randomChar = false;
    public static boolean playerCreated = false;
    public static boolean gameStarted = false;
    public static boolean playerGender;
    public static boolean stable = true;
    public static boolean savedataExists;
    public static boolean loadedData;
    
    //user input
    public static String userInput;
    
    //player vars
    public static String plrPswdC    = "NULL";
    public static String plrNameC    = "NULL";
    public static String plrGenderC  = "NULL";
    public static String plrHairC    = "NULL";
    public static String plrClothesC = "NULL";
    public static String plrClassC   = "NULL";
    public static String plrAspectC  = "NULL";
    public static String PlrLand1C   = "NULL";
    public static String PlrLand2C   = "NULL";
    
    //quick vars
    public static int landRand = 0;
    
    //generated vars
    public static int genName    = 0;
    public static int genHair    = 0;
    public static int genClothes = 0;
    public static int genClass   = 0;
    public static int genAspect  = 0;
    public static int genLand1 = 0;
    public static int genLand2 = 0;
    
    //save location (its too much work rewriting this all the time)
    public static String saveLoc = "C:/ProgramData/SBURB_Beta/";
    
    /**
     * Just clears userAnswered and userInput.
     * <p>
     * userInput is set to NULL for reasons.
     */
    public static void ClearInputs(){
        userAnswered = false;
        userInput = "NULL";
    }
    
    public static void ClearOutputs(){
        fw.ChangeDirectory("ROOTDIR");
        fw.ChangeFileName("NULL");
        fr.ChangeDirectory("ROOTDIR");
        fr.ChangeFile("NULL");
    }
}

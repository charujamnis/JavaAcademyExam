package com.dtcc.exams.fundamentals;


import java.sql.SQLOutput;
import java.util.Arrays;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String strspace="";
        int value=amountOfPadding-stringToBePadded.length();
        for(int i=0;i<value;i++){
            strspace+=" ";
        }
        return strspace+stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String strspace="";
        int value=amountOfPadding-stringToBePadded.length();
        for(int i=0;i<value;i++){
            strspace+=" ";
        }
        return stringToBePadded+strspace;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder sb=new StringBuilder(stringToBeRepeated.length()*numberOfTimeToRepeat);
       for(int i=0;i<numberOfTimeToRepeat;i++){
           sb.append(stringToBeRepeated);
       }
        return sb.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        //return (string.chars().allMatch(Character::isLetterOrDigit));
       string=string.replaceAll(" ","");
       char[] charArray=string.toCharArray();
       for(char c:charArray){
           if(!Character.isLetter(c)){ return false;}
       }
       return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        string=string.replaceAll(" ","");
        char[] charArray=string.toCharArray();
        for(char c:charArray){
            if(!Character.isDigit(c)){ return false;}
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String specialCharacters = "[" + "-/@#!*$%^&.'_+={}()"+ "]+" ;
        if (string.matches(specialCharacters)) {
            return true;
        } else {
            return false;
        }
    }
}

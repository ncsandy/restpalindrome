package com.zillion.palindrome.util;

import java.util.HashSet;
import java.util.Locale;

public class PalindromeSolver {

    public PalindromeSolver() {
    }

    public long stringWorker(String name){
            //Here we need to find out stringLength for the formula
            int stringLength = 0;
            //We also need to find out the amount of uniqueChar for the formula as well
            int unqiueChar = 0;
            //total palindromes that can be made
            long count = 0;

            //set the parameters to strip from the string
            name = name.replaceAll("[,;.\\s]", "");
            //finding out how long the string after being cleaned up
            stringLength = name.length();
            //make it all lover case to avoid any case issues
            name = name.toLowerCase(Locale.ROOT);
            //we call this function to get the unique characters in the string
            unqiueChar = unqiueCharacters(name);

            //after all the hard work is done in the function we assign to this variable
            count = counterCalc(unqiueChar, stringLength);

            return count;
        }

    public int unqiueCharacters(String name){

        //pretty fast way to get unique characters
        HashSet<Character> uniqueChar = new HashSet<>();

        //loop through the string putting the chars into the Hashset
        for(int i=0; i<name.length(); i++){
            char c = name.charAt(i);
            uniqueChar.add(c);

        }
        //here we get the amount of unique characters to we can use it later in the formula
        return uniqueChar.size();
    }

    public long counterCalc(int uChars, int length){
        //the count for the palindromes that could be made
        long count = 0;
        //if the length is not even then we add one to it
        if (length % 2 != 0) {
            length++;
        }
        //If the length is even then there is no need to plus it
        length /= 2;
        count = (long) Math.pow(uChars,length);

        return count;

    }




}

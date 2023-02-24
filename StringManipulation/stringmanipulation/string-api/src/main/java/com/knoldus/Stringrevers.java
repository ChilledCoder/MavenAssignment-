package com.knoldus;

public class Stringrevers {


    //function to Get string length

    int getStringLength(String stringInput) {
        int stringLength = 0;
        for (char CharCount : stringInput.toCharArray()) {
            stringLength++;
        }
        return stringLength;
    }


    //reversing the string
    String reverseString(String stringInput) {

        //calling my getStringLength function
        int stringLength = getStringLength(stringInput);
        String reversedString = "";
        for (int inputIndex = stringLength - 1; inputIndex >= 0; inputIndex--) {
            reversedString = reversedString.concat(String.valueOf(stringInput.charAt(inputIndex)));
        }
        return reversedString;
    }



}

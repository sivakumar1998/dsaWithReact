package com.siva.basicmath;

public class NumberPalindrome {
    public static void main(String ... args){

        IO.println(isPalindrome(1));
    }
    public static  boolean isPalindrome(int number){
        return number==ReverseANumber.getReversedNumber(number);

    }
}

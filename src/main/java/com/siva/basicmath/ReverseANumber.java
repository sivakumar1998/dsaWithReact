package com.siva.basicmath;

public class ReverseANumber {
    public static void main(String [] args){
        IO.println(getReversedNumber(334));

    }
    public static int getReversedNumber(int number){
        int reversedNumber=0;
        while(number!=0){
            int lastDigit=number%10;
            reversedNumber=reversedNumber*10+lastDigit;
            number=number/10;
        }
        return reversedNumber;

    }
    
}

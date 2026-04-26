package com.siva.basicmath;

public class TrailingZerosEfficient {
    public static void main(String[] args) {
        
    }
    public static int getNumberOfTrailingZeros(int number){
        int result=0;
        for(int i=5;i<=number;i=i*5){
            result=result+number/i;
        }
        return result;
    }
}

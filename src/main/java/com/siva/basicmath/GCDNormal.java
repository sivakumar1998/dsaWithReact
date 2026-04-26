package com.siva.basicmath;

public class GCDNormal {
    public static void main(String[] args) {
        IO.println(getGCD(18, 9));
    }
    public static int getGCD(int number1,int number2){
        int intialGcd=Math.min(number1,number2);
        while(intialGcd > 0){
            if(number1%intialGcd==0 && number2%intialGcd==0){
                return intialGcd;
            }else{
                intialGcd--;
            }
        }
        return intialGcd;
    }
}

package com.siva.basicmath;

public class GCDOptimized {
    public static void main(String[] args) {
        IO.println(getGcd(2,3));
    }
    

public static int getGcd(int number1,int number2){

    while(number1 != number2){
        if(number1 > number2){
            number1 = number1-number2;
        }else{
            number2 =number2 - number1;
        }
    }
return number1;
    
}
}

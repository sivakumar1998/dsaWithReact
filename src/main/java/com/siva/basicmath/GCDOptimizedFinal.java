package com.siva.basicmath;

public class GCDOptimizedFinal {
    public static void main(String[] args) {
        IO.println(getGcd(20, 3));
    }
    
    public static int getGcd(int number1,int number2){
        if(number2==0){
            return number1;
        }
        return getGcd(number2, number1%number2);
    }
}

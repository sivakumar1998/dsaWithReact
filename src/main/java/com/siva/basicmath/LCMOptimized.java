package com.siva.basicmath;

public class LCMOptimized {
    public static void main(String[] args) {
        IO.println(getLcm(10, 5));
    }
    public static int getLcm(int number1, int number2){
        int product = number1* number2;
        int gcd= GCDOptimizedFinal.getGcd(number1, number2);
        return  product/gcd;

    }
}

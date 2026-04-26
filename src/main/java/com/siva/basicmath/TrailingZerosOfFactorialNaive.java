package com.siva.basicmath;

public class TrailingZerosOfFactorialNaive {
    public static void main(String[] args) {
        IO.println(getTrailingZerosInFactorial(10));
    }
    public static int getTrailingZerosInFactorial(int number){
        long factorial=FactorialIterative.getFactorial(number);
       IO.println(factorial);
        int trailingZeros=0;
        while(factorial%10==0){
            trailingZeros++;
            factorial/=10;
        }
        return trailingZeros;
    }
}

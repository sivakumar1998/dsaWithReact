package com.siva.basicmath;

public class FactorialRecursive {
    public static void main(String[] args) {
        IO.println(getFactorial(10));
    }
    public static long getFactorial(int number){
        if(number==0){
            return 1;
        }
        return number*getFactorial(number-1);
    }
}

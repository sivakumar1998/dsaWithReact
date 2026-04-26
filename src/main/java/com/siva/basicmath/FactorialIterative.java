package com.siva.basicmath;

public class FactorialIterative {
    public static void main(String[] args) {
        IO.println(getFactorial(10));
    }

    public static long getFactorial(int number) {
        long factorial = 1L;
        if (number == 0 || number == 1) {
            return 1;
        } else if (number > 1) {
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
}

package com.siva.basicmath;

public class LCMNaive {
    public static void main(String[] args) {
IO.println(getLcm(10,3));
    }

    public static int getLcm(int number1, int number2) {
        int lcm = Math.max(number1, number2);
        while (true) {
            if (lcm % number1 == 0 && lcm % number2 == 0) {
                return lcm;
            }
            lcm++;
        }
    }
}

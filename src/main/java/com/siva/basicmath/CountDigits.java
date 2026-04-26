package com.siva.basicmath;

public class CountDigits {
    public static void main(String... args) {
        IO.println(getDigtsCount(-2322));
    }

    public static int getDigtsCount(int number) {
        int noOfDigits = 0;
        while (number != 0) {
            number = number / 10;
            noOfDigits++;
        }
        return noOfDigits;
    }
}
package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) throws RuntimeException {
        long tmp = inputNumber;
        long revers = 0;

        if (inputNumber < 0) {
            tmp = tmp * (-1);
        }
        while (tmp > 0) {
            revers = revers * 10;
            revers = revers + tmp % 10;
            tmp = tmp / 10;
        }
        if (inputNumber < 0) {
            revers *= -1;
        }

        if (revers < -2147483648 || revers > 2147483647) {
            throw new RuntimeException(String.format("The entered number %s cannot be converted", inputNumber));
        } else {
            return (int) revers;
        }
    }
}


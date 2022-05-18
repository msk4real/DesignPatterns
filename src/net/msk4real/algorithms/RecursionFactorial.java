package net.msk4real.algorithms;

import java.math.BigInteger;

public class RecursionFactorial {
    public static void main(String[] args) {
        BigInteger bigInteger = factorialWithRecursion(5);
        System.out.println(bigInteger);

        BigInteger bigInteger2 = factorial(5);
        System.out.println(bigInteger2);

    }

    // Сначала высчитывается вложенный факториал(4),
    // который равен 24, т.е 6*4. Затем 5 умножается на 24.
    //5*(4*(3*(2*(1)))) - формула
    private static BigInteger factorialWithRecursion(int value) {
        if (value <= 1) {
            return BigInteger.ONE;
        }else {
            return BigInteger.valueOf(value).multiply(factorialWithRecursion(--value));
        }
    }


    //просто факториал
    private static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    //result = 1, 2, 6, 24, 120
    //1*1, 1*2, 2*3, 6*4, 24*5
}


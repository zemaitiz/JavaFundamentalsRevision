package basics;

import java.math.BigInteger;
import java.util.Scanner;


public class SumOfBiggestIntegers {
    public static void main(String[] args) {
        //pirmas budas
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        BigInteger bigX = BigInteger.valueOf((long) x);
        BigInteger bigY = BigInteger.valueOf((long) y);
        BigInteger sum = bigX.add(bigY);
        System.out.println(sum);

        //antras budas su long
        long a = Integer.MAX_VALUE;
        long b = Integer.MAX_VALUE;
        long sumLong = a +b;
        System.out.println(sumLong);
    }
}

package basics;

import java.util.Scanner;

public class DoubleWithTwoDecimalPlaces {
    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu");
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        System.out.println("Ivestas skaicius " + x + " suapvalintas atrodo taip:" + "\n");
        System.out.printf("%.2f", x);
    }
}

package loopsandarrays;

import java.util.Scanner;

public class EqualLowerGreaterTwoAtATime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite skaiciu nr. 1");
        int a = input.nextInt();
        System.out.println("Iveskite skaiciu nr. 2");
        int b = input.nextInt();

        if (a > 30 && b > 30) {
            System.out.println("Abu daugiau uz 30");
        }
        else if (a < 30 && b > 30) {
            System.out.println("Pirmas mazesnis, antras didesnis uz 30");
        }
        else {
            System.out.println("Visi kiti atvejai");
        }
    }
}

package loopsandarrays;

import java.util.Scanner;

public class EqualLowerEtcOr {
    public static void main(String[] args) {
        System.out.println("Iveskite pirma sk.");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Iveskite antra sk.");
        int b = input.nextInt();

        if (a  > 30 || b > 30) {
            System.out.println("Bent vienas skaicius yra didesnis uz 30");
        }
        else if (a > 30 || b == 30) {
            System.out.println("Ivesti skaiciai didesni arba lygus 30");
        }
        else if (a <= 30 || b <= 30) {
            System.out.println("Bent vienas is skaiciu mazesnis arba lygus 30");
        }
        else {
            System.out.println("Yra daug kitu atveju, sitas vienas is ju");
        }
    }
}

package loopsandarrays;

import java.util.Scanner;

public class DivideBy {
    public static void main(String[] args) {
        boolean works = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");

        double x = input.nextDouble();
        if (x != 0) {


            do {
                System.out.println("Iveskite kita skaiciu:");
                double y = input.nextDouble();

                double divisionResult = x / y;
                System.out.println("Atsakymas: " + divisionResult);
                if (y == 0) {
                    System.out.println("Ivedete 0, programa sustojo");
                    works = false;
                }
            }
            while (works);


        } else {
            System.out.println("Ivedete 0, todel tolesnis programos veikimas neturi prasmes ");
        }
    }
}


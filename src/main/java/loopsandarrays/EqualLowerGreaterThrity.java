package loopsandarrays;

import java.util.Scanner;

public class EqualLowerGreaterThrity {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");

        int x = userInput.nextInt();

        if (x == 30) {
            System.out.println("Lygu 30");
        }
        else if (x > 30 ) {
            System.out.println("Daugiau uz 30");
        }
        else {
            System.out.println("Maziau uz 30");
        }
    }
}

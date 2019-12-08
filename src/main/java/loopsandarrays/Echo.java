package loopsandarrays;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        boolean works = true;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Enter your text here:");
            String message = input.nextLine();
            StringBuilder sb = new StringBuilder(message);
            sb.reverse();
            System.out.println(sb);
            System.out.println("Do you want to continue or quit?" + "\n" + "c/q");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("q")) {
                works = false;
                System.out.println("Goodbye!");
            }
        }
        while (works);
    }
}

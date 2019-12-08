package basics;

import java.util.Scanner;

public class IntDivisionCastedToDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu:");
        int x = input.nextInt();
        System.out.println("Iveskite antra skaiciu:");
        int y = input.nextInt();

        //int divided = x/y;
        double divisionToDouble = ((double) x/y);
        System.out.println("Ivedete " + x + " ir " + y + " . Ju dalmuo, suapvalintas iki 3 skaitmenu po kablelio, atrodo taip:" + "\n");
        System.out.printf("%.3f", divisionToDouble);


    }
}

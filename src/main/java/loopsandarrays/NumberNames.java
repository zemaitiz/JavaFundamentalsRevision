package loopsandarrays;

import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu nuo 1 iki 9");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String stringOutput;

        switch (a) {
            case 1:
                stringOutput = "Vienas";
                break;
            case 2:
                stringOutput = "Du";
                break;
            case 3:
                stringOutput = "Trys";
                break;
            case 4:
                stringOutput = "Keturi";
                break;
            case 5:
                stringOutput = "Penki";
                break;
            case 6:
                stringOutput = "Sesi";
                break;
            case 7:
                stringOutput = "Septyni";
                break;
            case 8:
                stringOutput = "Astuoni";
                break;
            case 9:
                stringOutput = "Devyni";
                break;
            default:
                stringOutput = "Ivedete per dideli arba per maza skaiciu";


        }
        System.out.println("Ivesto skaiciaus pavadinimas: " + stringOutput);
    }
}

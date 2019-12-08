package loopsandarrays;

import java.util.Scanner;

public class ShoppingMilkWine {
    public static void main(String[] args) {
        System.out.println("Sveiki atvyke i pieno ir vyno parduotuve. Ka noretumete pirkti?");
        System.out.println("pieno/vyno");
        Scanner input = new Scanner(System.in);

        String answerTypeOfPurchase = input.nextLine();



        if (answerTypeOfPurchase.equalsIgnoreCase("pieno")) {
System.out.println("Prasom, bus 1.99");
            System.out.println("*iveskite suma, kuria duodate pardavejui:");
            double moneyGivenForMilk = input.nextDouble();

            if (moneyGivenForMilk >= 1.99) {
                System.out.println("Dekoju, kad pirkote. (Jusu graza). Geros dienos.");
            }
            else {
                System.out.println("Sorry, paieskokite daugiau pinigu.");
            }
        }
        else if (answerTypeOfPurchase.equalsIgnoreCase("vyno")) {
            System.out.println("Ar turite 18m.?");
            System.out.println("taip/ne");
            String answerYesNo = input.nextLine();
            if (answerYesNo.equalsIgnoreCase("taip")) {
                System.out.println("Prasom, bus 5.99");
                System.out.println("*iveskite suma, kuria duodate pardavejui:");
                double moneyGivenForWine = input.nextDouble();

                if (moneyGivenForWine >= 5.99) {
                    System.out.println("Dekoju, kad pirkote. (Jusu graza). Geros dienos.");
                }
                else {
                    System.out.println("Sorry, paieskokite daugiau pinigu.");
                }
            }
            else if (answerYesNo.equalsIgnoreCase("ne")) {
                System.out.println("Sorry, sugrizkite, kai turesite 18m.");
            }

        }
        else {
            System.out.println("Nesupratau jusu...");
        }
    }
}

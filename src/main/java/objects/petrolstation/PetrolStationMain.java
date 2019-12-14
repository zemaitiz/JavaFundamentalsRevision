package objects.petrolstation;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.math.RoundingMode.*;

public class PetrolStationMain {

    //vieno litro kaina eur/l
    public static final double PRICE_DIESEL = 1.11;
    public static final double PRICE_95 = 1.18;
    public static final double PRICE_98 = 1.25;

    //pylimo greitis l/s
    public static final double FLOW_RATE = 0.184;

    public static void main(String[] args) {

        List<FuelTank> fuelTankList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean fuel = true;
        BigDecimal price = BigDecimal.ZERO;

        while (fuel) {
            System.out.println("Hello, which type of fuel would you like to buy?");
            System.out.println("diesel | 95 | 98");
            String fuelType = input.nextLine();
            System.out.println("Press the F button to start filling the tank. Press S button to stop.");
            String buttonStart = input.nextLine();
            long start = System.nanoTime();
            long stop = 0;

            //aprasom pylimo veiksma

            if (buttonStart.equalsIgnoreCase("f")) {

                System.out.println("Press S button when you want to stop fueling.");
                String buttonStop = input.nextLine();
                if (buttonStop.equalsIgnoreCase("s")) {

                    stop = System.nanoTime();
                }
            }
            long totalFuelingTime = stop - start;

            double volume = (double) totalFuelingTime / 1000000000 * FLOW_RATE;

            if (fuelType.equalsIgnoreCase("diesel")) {
                price = BigDecimal.valueOf(volume * PRICE_DIESEL);
            } else if (fuelType.equalsIgnoreCase("95")) {
                price = BigDecimal.valueOf(volume * PRICE_95);
            } else if (fuelType.equalsIgnoreCase("98")) {
                price = BigDecimal.valueOf(volume * PRICE_98);
            }
            FuelTank fuelTank = new FuelTank(fuelType, volume, price);
            fuelTankList.add(fuelTank);

            System.out.println("Do you want to fill another tank? + \n + Y/N");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                fuel = false;
//cia apskaiciuojam visu baku kaina
                BigDecimal totalPrice = BigDecimal.ZERO;
                System.out.println("You have filled " + fuelTankList.size() + " tank(s): \n ");
                for (FuelTank t : fuelTankList) {
                    totalPrice = totalPrice.add(t.getPrice());
                    System.out.println(t.getType().toUpperCase() + " " + t.getVolume() + " L" + ", " + t.getPrice().setScale(2, HALF_UP) + " EUR");
                }
                System.out.println("Total price is " + totalPrice.setScale(2, HALF_UP) + " Eur");
                System.out.print("***Enter the amount of money you pay***");
                System.out.println();
                BigDecimal amountOfMoney = input.nextBigDecimal();
                if (amountOfMoney.equals(totalPrice)) {
                    System.out.println("Thank you and have a nice day!");
                } else if (amountOfMoney.compareTo(totalPrice) < 0) {
                    System.out.println("Sorry but the amount you gave is too little, look for more or we will have to call 112 ");
                } else if (amountOfMoney.compareTo(totalPrice) > 0) {
                    System.out.println("Thank you! Here is your change and have a nice day!");
                }
            }

        }

    }
}


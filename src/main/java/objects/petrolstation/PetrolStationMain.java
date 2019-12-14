package objects.petrolstation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        double price = 0;

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

            double volume = totalFuelingTime * 1000000000 * FLOW_RATE;

            if (fuelType.equalsIgnoreCase("diesel")) {
                price = volume * PRICE_DIESEL;
            } else if (fuelType.equalsIgnoreCase("95")) {
                price = volume * PRICE_95;
            } else if (fuelType.equalsIgnoreCase("98")) {
                price = volume * PRICE_98;
            }
            FuelTank fuelTank = new FuelTank(fuelType, volume);
            fuelTankList.add(fuelTank);

            System.out.println("Do you want to fill another tank? + \n + Y/N");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                fuel = false;
                System.out.println("You have filled " + fuelTankList.size() + " tanks: \n ");
                for (FuelTank t : fuelTankList) {
                    System.out.println(t.getType().toUpperCase() + " " + t.getVolume() + "L" + " , " + price + "EUR");
                }
            }

        }
    }
}

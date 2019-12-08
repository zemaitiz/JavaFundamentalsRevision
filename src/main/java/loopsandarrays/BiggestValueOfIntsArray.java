package loopsandarrays;

import java.util.Random;

public class BiggestValueOfIntsArray {
    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = 5;
        //int [] randomInts = null;    sitas meta null pointer exception
        //kadangi cikle zemiau bandom prideti elementa i nezinomo dydzio array, todel java nezino kurioj vietoj det ta elementa...
        int[] randomInts = new int[arraySize];  //sitas geras, nurodome array dydi


        for (int j = 0; j < 5; j++) {
            int maxValue = randomInts[0];
            for (int i = 0; i < arraySize; i++) {
                int randomInt = random.nextInt(100);
                randomInts[i] = randomInt;
                if (randomInts[i] > maxValue) {
                    maxValue = randomInts[i];
                }
                System.out.print(randomInts[i] + " ");
            }
            System.out.print("Max value: " + maxValue);
            System.out.println();
        }
    }
}


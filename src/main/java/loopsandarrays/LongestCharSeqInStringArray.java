package loopsandarrays;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class LongestCharSeqInStringArray {
    public static void main(String[] args) {
        String[] arrayOfStrings = new String[5];
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arrayOfStrings.length; i++) {
            //vienas variantas
               /* int randomMinLegthInclusive = random.nextInt(20);
                int randomMaxLengthExclusive = random.nextInt(20);
                String randomString = RandomStringUtils.randomAlphanumeric(1, randomMaxLengthExclusive);*/

            //antras variantas
            int randomStringLength = random.nextInt(10);
            String randomString = RandomStringUtils.randomAlphanumeric(1, randomStringLength + 1);

            arrayOfStrings[i] = randomString;
        }

        int maxValue = arrayOfStrings[0].length();
        String longestString = arrayOfStrings[0];
        for (int i = 0; i < arrayOfStrings.length; i++) {

            System.out.println(arrayOfStrings[i]);
            if (arrayOfStrings[i].length() > maxValue) {
                maxValue = arrayOfStrings[i].length();
                longestString = arrayOfStrings[i];
            }
        }
        System.out.println("The longest string is " + longestString + " and its length is " + longestString.length() + " chars");
    }
}

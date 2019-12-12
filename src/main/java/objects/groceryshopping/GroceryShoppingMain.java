package objects.groceryshopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryShoppingMain {
    public static void main(String[] args) {
        List<Product> shoppingCart = new ArrayList<>();
        Scanner userInputString = new Scanner(System.in);
        Scanner userInputDouble = new Scanner(System.in);
        boolean shop = true;
        int productCount = 0;

        while (shop) {
            while (productCount < 5) {

                System.out.println("What product would you like to add to your cart?");
                String productName = userInputString.nextLine();
                System.out.println("What is this product price?");
                double productPrice = userInputDouble.nextDouble();

                Product product = new Product(productName, productPrice);
                shoppingCart.add(product);
                productCount++;
            }

            System.out.println("Final price: " + findFinalPrice(shoppingCart) + " EUR");
            System.out.println("Do you want to shop again? y/n:");
            String answer = userInputString.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                shop = false;
                System.out.println("Goodbye and have a nice day!");
            }

        }
    }

    private static double findFinalPrice(List<Product> shoppingCart) {
        double finalPrice = 0;
        for (Product p : shoppingCart) {
            System.out.println("You added to your cart:");
            System.out.println(p.getName() + " , " + p.getPrice() + " EUR");
            finalPrice += p.getPrice();
        }
        return finalPrice;
    }
}


package objects.tictactoe;

import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello and welcome to TicTacToe. Do you want to be X or O? \n");
        String userTypeChoice = input.nextLine();
        if (userTypeChoice.equalsIgnoreCase("x")) {}
        else if (userTypeChoice.equalsIgnoreCase("0")) {}
        else {
            System.out.println("Please enter x or 0");
        }
    }
}

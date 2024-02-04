/*
Programmers: Joel Robinson & Heloisa Albuquerque
Course: Mr Nweke
Due Date: 2/2/2024
Lab Assignment: 2
Problem Statement: Simulating the powerball numbers and printing out 10 lines of 6.
Data In: Item, Customer name
Data Out:Total Random Numbers and Current Jackpot
Credits: In class
 */
//Imports
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
class Lab2 {
    public static void main(String[] args) {
        double prize = 0;

        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Create a random
        Random rand = new Random();

        //Initialize Winning Numbers
        int win1 = 3;
        int win2 = 5;
        int win3 = 16;
        int win4 = 58;
        int win5 = 59;
        int win6 = 11;

        //Create two formats for prize and numbers
        DecimalFormat dfmt = new DecimalFormat("00");
        DecimalFormat df = new DecimalFormat("###,###,###,###,###,###.##");

        //Print statements
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //Ask for name and receive input
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

        System.out.print("How much do you want to play?");
        double playAmount = input.nextDouble();

        System.out.println(customerName + " wants to play $" + playAmount );

        //For loop to create 10 lines or 6 random numbers
        for(int i = 0; i < 10; i++ ) {
            String line = "";

            //Generates random number from 0-99
            int random1 = rand.nextInt(99);
            //Changes format of the integer to 00
            String crandom1 = dfmt.format(random1);

            var random2 = rand.nextInt(99);
            String crandom2 = dfmt.format(random2);

            var random3 = rand.nextInt(99);
            String crandom3 = dfmt.format(random3);

            var random4 = rand.nextInt(99);
            String crandom4 = dfmt.format(random4);

            var random5 = rand.nextInt(99);
            String crandom5 = dfmt.format(random5);

            var random6 = rand.nextInt(99);
            String crandom6 = dfmt.format(random6);

            //Creates a line separating each number by a space and prints
            line = crandom1 + " " + crandom2 + " " + crandom3 + " " + crandom4 + " " + crandom5 + " " + crandom6;
            System.out.println(line);

            if(random1 == win1 || random2 == win2 || random3 == win3 || random4 == win4 || random5 == win5 || random6 == win6 ){
                playAmount = Math.pow(playAmount,1.75);
                prize = playAmount;
            }


        }

        String cplayAmount = df.format(playAmount);
        String cprize = df.format(prize);
        //Prints thank you messages
        System.out.println("-----------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("-----------------");
        System.out.println("Your Winnings are: ");
        System.out.println("$" + cprize);
        System.out.println("-----------------");
    }
}

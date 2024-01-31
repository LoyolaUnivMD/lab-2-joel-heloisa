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
        long prize = 225938745L;

        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Create a random
        Random rand = new Random();

        //Create two formats for prize and numbers
        DecimalFormat dfmt = new DecimalFormat("00");
        DecimalFormat df = new DecimalFormat("###,###,###");
        //Apply format to prize
        String cprize = df.format(prize);

        //Print statements
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //Ask for name and receive input
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

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

        }
        //Prints thank you messages
        System.out.println("-----------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot: ");
        System.out.println("$" + cprize);
        System.out.println("-----------------");
    }
}

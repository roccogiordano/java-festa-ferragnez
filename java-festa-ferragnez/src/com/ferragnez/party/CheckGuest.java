package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        // Array Declaration

        String[] Guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        //


        // User Input

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter your name...");

        String UserName = Input.nextLine();

        Input.close();

        //


        // Array Iteration and Output Display

        for (int i = 0; i < Guests.length; i++) {

            if (Guests[i].toLowerCase().equals(UserName.toLowerCase())) {
                System.out.println("Hello " + UserName + " we are happy to welcome you to the party!");
                break;
            } else if (i == (Guests.length - 1)) {
                System.out.println("Unfortunately you are not on the guest list!");;
            } else {
                continue;
            }

        }

        //
    }
}

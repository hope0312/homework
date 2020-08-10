package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets:\n");
        Scanner scanner = new Scanner(System.in);
        int tickets = scanner.nextInt();
        System.out.print("How many round-trip tickets:\n");
        int roundtickets = scanner.nextInt();
        Train tra = new Train(tickets,roundtickets);
        tra.print();
    }
}

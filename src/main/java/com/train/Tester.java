package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int totaltickets=0;
        while(totaltickets!=-1) {
            System.out.print("Please enter number of tickets:\n");
            Scanner scanner = new Scanner(System.in);
            int tickets = scanner.nextInt();
            System.out.print("How many round-trip tickets:\n");
            int roundtickets = scanner.nextInt();
            System.out.println("Total tickets:" + (tickets + roundtickets) + "\n" + "Round-trip:" + roundtickets + "\n" + "Total:" + (int) ((tickets * 1000) + (roundtickets * 2000 * 0.9)));
            System.out.println("if input -1 break else keep");
            totaltickets = scanner.nextInt();
        }

    }
}
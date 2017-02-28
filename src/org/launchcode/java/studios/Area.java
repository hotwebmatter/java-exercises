package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by modus on 2/27/17.
 * Write a program/class Area that prompts the user for a number, and then
 * calculate the area of a circle with that radius and print the result.
 */
public class Area {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double radius, area;

        do {
            System.out.println("Enter a radius:");
            while (!in.hasNextDouble()) {
                System.out.println("Please enter a number!");
                in.next();
            }
            radius = in.nextDouble();
        } while (radius < 0);

        area = Math.PI * radius * radius;

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}

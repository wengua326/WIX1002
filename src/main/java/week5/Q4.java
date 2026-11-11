/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author wengu
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ... , 6 for Saturday): ");
        int firstDayOfYear = input.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int febDays = isLeap ? 29 : 28;

        int daysToMay = 31 + febDays + 31 + 30;
        int mayFirstDay = (firstDayOfYear + daysToMay) % 7;

        int daysToAug = daysToMay + 31 + 30 + 31;
        int augFirstDay = (firstDayOfYear + daysToAug) % 7;

        System.out.println("\nMay " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < mayFirstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= 31; day++) {
            System.out.printf("%3d ", day);
            if ((day + mayFirstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("\nAugust " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < augFirstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= 31; day++) {
            System.out.printf("%3d ", day);
            if ((day + augFirstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
}

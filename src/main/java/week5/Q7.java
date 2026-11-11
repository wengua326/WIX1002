/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author wengu
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double P = input.nextDouble();

        System.out.print("Enter interest in %: ");
        double i = input.nextDouble();

        System.out.print("Enter total number of month(s): ");
        int N = input.nextInt();

        double monthlyRate = i / (12 * 100);
        double M = (P * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -N));

        System.out.printf("%-5s %22s %16s %16s %16s %16s\n", 
                "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");

        double totalInterest = 0.0;
        for (int n = 1; n <= N; n++) {
            double C = M * Math.pow(1 + monthlyRate, -(1 + N - n));
            double L = M - C;
            double R = (L / monthlyRate) - C;
            totalInterest += L;

            System.out.printf("%-5d %22.2f %16.2f %16.2f %16.2f %16.2f\n", 
                    n, M, C, L, R, totalInterest);
        }
    }
    
}

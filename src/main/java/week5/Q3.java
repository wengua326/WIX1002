/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author wengu
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int sumSq = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a score [negative score to quit]:");
            int score = input.nextInt();

            if (score < 0) {
                break;
            }

            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }

            sum += score;
            sumSq += score * score;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            double variance = (sumSq - (double) (sum * sum) / count) / (count - 1);
            double stdDev = Math.sqrt(variance);

            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f\n", average);
            System.out.printf("Standard Deviation: %.2f\n", stdDev);
        }
    }
    
}

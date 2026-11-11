/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wengu
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter N students: ");
        int n = input.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = rand.nextInt(101);
        }

        System.out.print("List of scores: ");
        for (int i = 0; i < n; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
            sum += scores[i];
        }

        double average = (double) sum / n;

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.printf("Average score: %.2f\n", average);
    }
    
}

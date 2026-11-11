/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author wengu
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    matrix[row][col] = 1;
                } else {
                    matrix[row][col] = matrix[row - 1][col] + matrix[row - 1][col - 1];
                }
            }
        }

        System.out.println("The Pascal Triangle with " + n + " row(s)");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.printf("%-4d", matrix[row][col]);
            }
            System.out.println();
        }
    }
    
}

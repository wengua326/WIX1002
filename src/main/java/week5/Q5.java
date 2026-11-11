/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Random;

/**
 *
 * @author wengu
 */
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();

        int p1Score = 0;
        int p2Score = 0;

        while (p1Score <= 100 && p2Score <= 100) {
            int roll;
            do {
                roll = rand.nextInt(6) + 1;
                p1Score += roll;
                System.out.println("Player 1 rolled: " + roll + " | Current Score: " + p1Score);
                if (p1Score > 100) {
                    break;
                }
            } while (roll == 6);

            if (p1Score > 100) {
                break;
            }

            do {
                roll = rand.nextInt(6) + 1;
                p2Score += roll;
                System.out.println("Player 2 rolled: " + roll + " | Current Score: " + p2Score);
                if (p2Score > 100) {
                    break;
                }
            } while (roll == 6);
        }

        if (p1Score > 100) {
            System.out.println("\nPlayer 1 wins the game!");
        } else {
            System.out.println("\nPlayer 2 wins the game!");
        }
    }
    
}

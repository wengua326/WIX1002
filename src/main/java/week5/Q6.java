/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Random;

/**
 *
 * @author wengu
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(Integer.MAX_VALUE);

        System.out.println("Generated non-negative integer: " + number);

        int count = 0;
        int temp = number;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
    
}

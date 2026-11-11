/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author wengu
 */
import java.util.Random;
import java.util.Scanner;
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        final int N = 20;
        int[] num = new int[N];

        
        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(101);
        }

        
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (num[j + 1] < num[j]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();

        
        System.out.print("Enter a number to search: ");
        int x = input.nextInt();

        
        int loop_li = 0;
        boolean isFoundLinear = false;
        for (int k = 0; k < num.length; k++) {
            loop_li++; 
            if (x == num[k]) {
                isFoundLinear = true;
                break;
            }
        }
        System.out.println(x + (isFoundLinear ? " Found" : " Not Found"));
        System.out.println("Linear Search - " + loop_li + " loop(s)");

        
        int loop_bi = 0;
        int low = 0;       
        int high = N - 1; 
        boolean isFoundBinary = false;

        while (low <= high) { 
            loop_bi++;    
            int median = (low + high) / 2;

            if (x > num[median]) {
                low = median + 1;      
            } else if (x < num[median]) {
                high = median - 1;    
            } else {
                isFoundBinary = true;  
                break;
            }
        }
        System.out.println(x + (isFoundBinary ? " Found" : " Not Found"));
        System.out.println("Binary Search - " + loop_bi + " loop(s)");
        
    }
}
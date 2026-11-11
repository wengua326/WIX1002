/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author wengu
 */
import java.util.Scanner;
/**
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int x = input.nextInt();
        int j = 0;
        int[] factor = new int [x];
        for (int i = 1 ; i<=x ; i++){
            if (x % i == 0){
                factor[j]=i;
                j++;
            }     
        }
        System.out.print("The factor are: ");
        for(int i = 0 ; i<x; i++){
            if(factor[i] != 0)
                System.out.print(factor[i]+" ");
            else
                break;
        }
        
    }
}
**/
/**
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int x = input.nextInt();
        System.out.print("The factor are: ");
        for (int i = 1 ; i<=x ; i++){
            if (x % i == 0){
                System.out.print(i+" ");
            }      
        }
    }   
}
**/
import java.util.Collections;
import java.util.ArrayList;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int x = input.nextInt();
        ArrayList<Integer> factor = new ArrayList <>();
        for (int i = 1 ; i<=Math.sqrt(x) ; i++){
            if (x % i == 0){
                factor.add(i);
                factor.add(x/i);
            }      
        }
        Collections.sort(factor);
        System.out.println(factor);
    }   
}



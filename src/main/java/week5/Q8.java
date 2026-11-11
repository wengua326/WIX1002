/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author wengu
 */
import java.util.Random;
public class Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random input = new Random();
        int x = input.nextInt(0,101);
        int num = 0;
        int i=2;
        while(num<x){
            boolean isPrime = true;
            for (int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true){
                num++;
                System.out.print(i+" ");
            } 
            i++;
        }
    }
}

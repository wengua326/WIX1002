/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author wengu
 */
import java.util.Scanner;
import java.util.Random;
public class Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter number of employee: ");
        final int N = input.nextInt();
        int[][] table = new int [N][8];
        for(int em=0;em<N;em++){
            int sum = 0 ;
            for(int day=0;day<7;day++){
                int x = r.nextInt(1,9);
                table[em][day]=x;
                sum+=x;
                System.out.print(table[em][day]+" ") ;//if use stream printing then non sense to store in array
            }
            table[em][7]=sum;
            System.out.println(table[em][7]);
            }
        System.out.println();

    }
}

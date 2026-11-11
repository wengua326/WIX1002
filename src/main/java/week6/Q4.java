/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wengu
 */
public class Q4 {
      public static void main(String[] args) {
        int[][] newMatrix = new int [3][3];
        int[][] oldMatrix = {{1,5,7},{3,6,9},{5,3,8}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                newMatrix[i][2-j] = oldMatrix[j][i];
            }
        }
        for(int[] row : newMatrix ){
            for (int x : row){
                System.out.printf("%4d",x);
            }
            System.out.println();
        }
        
    }
  
}


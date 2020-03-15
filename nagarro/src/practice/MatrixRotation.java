/**
 * @author Abhishek Singh
 * last update  7:01 PM 29/02/20
 **/
//rotation by 90 degree in anticlockwise
package practice;

import java.util.*;

public class MatrixRotation {
    public static void rotateMatrix(int [][]matrix){
        int len=matrix.length;
        for(int i=0;i<len/2;i++){
            for(int j=i;j<len-1-i;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][len-1-i];
                matrix[j][len-1-i]=matrix[len-1-i][len-1-j];
                matrix[len-1-i][len-1-j]=matrix[len-1-j][i];
                matrix[len-1-j][i]=temp;
                displayMatrix(matrix);

            }
        }
    }
    public static void displayMatrix(int [][]matrix){
        for(int []i:matrix){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of matrix");
        int num=sc.nextInt();
        int [][]matrix=new int [num][num];
        System.out.println("enter matrix elements");
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        displayMatrix(matrix);
        rotateMatrix(matrix);
        //displayMatrix(matrix);



    }
}

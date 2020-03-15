/**
 * @author Abhishek Singh
 * last update  2:05 PM 04/03/20
 **/
package practice;

import java.util.Scanner;

public class SpiralPrint {
    public static void printSpiral(int [][]arr){
        int length=arr[0].length*arr.length;
        int colL=0,colR=arr[0].length-1,rowU=0,rowD=arr.length-1;
        while(length>0){
            int i=rowU,j=colL;
            while (j<=colR &&length>0){
                System.out.print(arr[i][j]+" ");
                length--;
                j++;
            }
            rowU++;
            i=rowU;
            j=colR;
            while (i<=rowD &&length>0){
                System.out.print(arr[i][j]+" ");
                i++;
                length--;
            }
            colR--;
            i=rowD;
            j=colR;
            while (j>=colL &&length>0){
                System.out.print(arr[i][j]+" ");
                j--;
                length--;
            }
            rowD--;
            i=rowD;
            j=colL;
            while(i>=rowU &&length>0){
                System.out.print(arr[i][j]+" ");
                i--;
                length--;
            }
            colL++;


        }
    }

    public static void main(String[] args) {
        //Starts coding
         /*
        int [][]arr={{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
       printSpiral(arr);
    */
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int [][]arr=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printMatrix(arr);
        printSpiral(arr);

    }
    public static void printMatrix(int [][]arr){
        for(int []a:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}

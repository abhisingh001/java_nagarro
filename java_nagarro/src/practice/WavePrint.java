/**
 * @author Abhishek Singh
 * last update  12:59 AM 23/02/20
 **/
package practice;

import java.util.Scanner;

public class WavePrint {

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int [][]matrix=new int[row][column];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        printWaveByColumn(matrix);


    }
    public static void printWaveByRow(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    System.out.print(arr[i][j]+", ");
                }
            }
            else {
                for(int j=arr.length-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+", ");
                }

            }

        }
        System.out.print("END ");
    }
    public static void printWaveByColumn(int [][]arr)
    {
        int row=arr.length;
        int column=arr[0].length;
        for(int i=0;i<column;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<row;j++)
                {
                    System.out.print(arr[j][i]+", ");
                }
            }
            else {
                for(int j=row-1;j>=0;j--)
                {
                    System.out.print(arr[j][i]+", ");
                }

            }

        }
        System.out.print("END ");
    }
}

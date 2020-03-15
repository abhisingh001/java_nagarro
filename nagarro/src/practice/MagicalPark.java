/**
 * @author Abhishek Singh
 * last update  3:18 PM 04/03/20
 **/
package practice;

import java.util.Scanner;

public class MagicalPark {
    public static int energyLeft(char [][]arr,int energy,int strength){
        int len=arr[0].length-1;
        for(int i=0;i<arr.length;i++){
            inner:for(int j=0;j<arr[i].length;j++){
                switch (arr[i][j]){
                    case '.':
                        if(j!=3)
                        energy-=3;
                        else
                            energy-=2;
                        break;
                    case '*':
                        if(j!=3)
                            energy+=4;
                        else
                            energy+=5;
                        break;
                    case '#':
                        break inner;

                }
                if(energy<strength){
                    return -1;
                }
            }
        }
        return energy;
    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.skip("\n");
        char [][]arr=new char[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextLine().charAt(0);
            }
        }
        int e=energyLeft(arr,b,a);
        if(e>=a){
            System.out.print("Yes\n"+e);
        }
        else {
            System.out.print("No");
        }



    }
    public static void printMatrix(char [][]arr){
        for(char []a:arr){
            for(char b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}

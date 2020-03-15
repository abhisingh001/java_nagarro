/**
 * @author Abhishek Singh
 * last update  9:19 AM 03/03/20
 **/
package Recursion;

import java.util.Scanner;

public class SelectionSort
{
    public static void selectionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int index=findMin(arr,i,i);
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
    public static int findMin(int []arr,int start,int min){
        if(start>=arr.length){
            return min;
        }
        if(arr[start]<arr[min]){
            min=start;
        }
        return findMin(arr,start+1,min);

    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int []arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}

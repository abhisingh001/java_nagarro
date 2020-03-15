/**
 * @author Abhishek Singh
 * last update  9:38 AM 03/03/20
 **/
package Recursion;

import java.util.Scanner;

public class IsSorted {
    public static boolean isArraySorted(int []arr,int start){
        if(start>=arr.length-1){
            return true;
        }
        if(arr[start]>arr[start+1]){
            return false;
        }
        else{
            return isArraySorted(arr,start+1);
        }

    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int []arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(isArraySorted(arr,0));

    }
}

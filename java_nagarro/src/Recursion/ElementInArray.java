/**
 * @author Abhishek Singh
 * last update  9:49 AM 03/03/20
 **/
package Recursion;

import java.util.Scanner;

public class ElementInArray {
    public static boolean isInArray(int []arr,int start,int element){
        if(start<arr.length){
            if(arr[start]==element){
                return true;
            }
            return isInArray(arr,start+1,element);
        }
        else
            return false;

    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int []arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        System.out.print(isInArray(arr,0,element));

    }
}


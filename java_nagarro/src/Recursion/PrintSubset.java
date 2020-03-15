/**
 * @author Abhishek Singh
 * last update  1:59 PM 10/03/20
 **/
package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubset {
    public static void printSubSet(int []arr,int i,int l,ArrayList<Integer> a){
        if(i>l){
            for(int j: a){
                System.out.print(j+" ");
            }
            System.out.println();
            return;
        }
        a.add(arr[i]);
        printSubSet(arr,i+1,l,a);
        a.remove(a.size()-1);
        printSubSet(arr,i+1,l,a);

    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println(System.currentTimeMillis());
        long t1=System.currentTimeMillis();
        printSubSet(arr,0,n-1,new ArrayList<Integer>());
        long t2=System.currentTimeMillis();
        System.out.println(t2-t1);

    }
}

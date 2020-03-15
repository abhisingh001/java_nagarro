/**
 * @author Abhishek Singh
 * last update  12:48 AM 23/02/20
 **/
package com.company;


import java.util.Scanner;

public class Test {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(triangleValue(n));
    }

    public static int triangleValue(int n){
        if(n==0){
            return 0;
        }

        return n+ triangleValue(n-1);
    }
}

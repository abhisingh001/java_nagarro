/**
 * @author Abhishek Singh
 * last update  5:27 PM 28/02/20
 **/
package com.company;

import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String []a=str.split(" ");
        //Collections.reverse(a);
        //System.out.println(a.toString());
        for(String i:a)
        {
            System.out.print(i+" ");
        }

    }
}

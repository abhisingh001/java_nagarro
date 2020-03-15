/**
 * @author Abhishek Singh
 * last update  7:24 PM 29/02/20
 **/
package Recursion;

import java.util.*;

public class SumOfIntString {
    public static int findSum(String s){
        if(s.length()==0){
            return 0;
        }
        else{
            int sum=Integer.parseInt(s.substring(0,1));
            return sum + findSum(s.substring(1));
        }

    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(findSum(s));

    }
}

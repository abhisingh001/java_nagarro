/**
 * @author Abhishek Singh
 * last update  6:52 PM 02/03/20
 **/
package Recursion;

import java.util.*;

public class BracketSub {
    public static String findBracketString(String str,int start,int end){
        if(start>=str.length() || end<0){
            return "no bracket found";
        }
        if(str.charAt(start)=='(' && str.charAt(end)==')'){
            return str.substring(start+1,end);
        }
        if(str.charAt(start)!='(')
        {
            start++;
        }
        if(str.charAt(end)!=')'){
            end--;
        }
        return findBracketString(str,start,end);
    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(findBracketString(s,0,s.length()-1));

    }
}

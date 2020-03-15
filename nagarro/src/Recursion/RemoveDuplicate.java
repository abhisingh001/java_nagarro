/**
 * @author Abhishek Singh
 * last update  8:24 PM 03/03/20
 **/
package Recursion;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static String removeDuplicate(String s){
        HashSet<Character> hs=new HashSet<>();
        String ss="";
        for(int i=0;i<s.length();i++)
        {
            if(!hs.contains(s.charAt(i))){
                ss+=s.charAt(i);
                hs.add(s.charAt(i));
            }
        }
        return ss;

    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeDuplicate(s));

    }
}

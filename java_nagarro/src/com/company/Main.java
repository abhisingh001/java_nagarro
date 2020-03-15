package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        StringBuffer ss=new StringBuffer(sc.nextLine());
        permutat(ss,0,ss.length()-1);
        System.out.println("number of permutation"+countpermutation);
        System.out.println(allper);
        /*for (String f:allper) {
            System.out.println(f);

        }*/
    }
    static int countpermutation=0;
    static  ArrayList<String> allper=new ArrayList<>();
    public static void permutat(StringBuffer s, int start,int end)
    {
        if(start==end)
        {
            //System.out.println(s.toString());
            allper.add(s.toString());
            countpermutation++;

        }
        else
        {
            for(int i=start;i<=end;i++)
            {
                swap(s,start,i);
                permutat(s,start+1,end);

                swap(s,start,i);
            }
        }



    }
    public static void swap(StringBuffer s, int first,int second)
    {
        char c=s.charAt(first);
        s.setCharAt(first,s.charAt(second));
        s.setCharAt(second,c);

    }

}

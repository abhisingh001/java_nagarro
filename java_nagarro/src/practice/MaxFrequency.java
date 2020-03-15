/**
 * @author Abhishek Singh
 * last update  6:50 PM 03/03/20
 **/
package practice;

import java.util.Scanner;

public class MaxFrequency {
    public static char maxFrequency(String s){
        int []arr=new int[27];
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'a'+1;
            arr[a]+=1;
        }
        int max=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return (char)(index+96);
    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(maxFrequency(s));
    }
}

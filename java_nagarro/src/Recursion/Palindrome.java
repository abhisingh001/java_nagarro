/**
 * @author Abhishek Singh
 * last update  9:10 AM 03/03/20
 **/
package Recursion;

import java.util.*;

public class Palindrome {
    public  static boolean isPalindrome(int []arr,int start,int end){
        if(start<end){
            if(arr[start]!=arr[end]){
                return false;

            }
            else{
                return isPalindrome(arr,start+1,end-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int []arr=new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isPalindrome(arr,0,len-1));

    }
}

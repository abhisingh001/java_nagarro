/**
 * @author Abhishek Singh
 * last update  7:07 PM 02/03/20
 **/
package Recursion;

import java.util.*;

public class FirstIndex {
    public static int findFirstIndexOf(int []arr,int element,int start,String mode){
        if("first".equals(mode)){
            if(start>=arr.length){
                return -1;
            }
            if(arr[start]==element){
                return start;
            }
            else {
                return findFirstIndexOf(arr,element,start+1,mode);
            }
        }
        else{
            if(start<0){
                return -1;
            }
            if(arr[start]==element){
                return start;
            }
            else {
                return findFirstIndexOf(arr,element,start-1,mode);
            }
        }

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
        System.out.print(findFirstIndexOf(arr,element, arr.length-1,"last"));

    }
}

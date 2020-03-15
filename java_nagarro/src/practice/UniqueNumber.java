/**
 * @author Abhishek Singh
 * last update  6:05 PM 23/02/20
 **/
package practice;


import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumber {

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int []arr=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;)
        {
            if(i==arr.length-1)
            {
                System.out.println(arr[i]);
                break;
            }
            int a=arr[i]^arr[i+1];
            //System.out.println(a+" "+arr[i]);
            if(a!=0){
                System.out.println(arr[i]);
                break;

            }
            else
            {
                i=i+3;
               // System.out.println(i);
            }
        }

    }
}

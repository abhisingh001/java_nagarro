/**
 * @author Abhishek Singh
 * last update  12:02 AM 23/02/20
 **/
package practice;

import java.util.Scanner;

public class SortingInLinear {

    public static void main(String[] args) {
        /* Starts coding */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int zero,one,two;
        zero=0;
        one=zero;
        two=arr.length-1;
        while(one<=two) {
            if (arr[one] == 0) {
                swap(arr, one, zero);
                zero++;
                one++;
            }
            else if (arr[one] == 2) {
                swap(arr, one, two);
                two--;
            }
            else {
                //swap(arr, i, one);
                one++;
            }
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }
    public static void swap(int []a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

}

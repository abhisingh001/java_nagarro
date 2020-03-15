/**
 * @author Abhishek Singh
 * last update  2:03 AM 23/02/20
 **/
package practice;

import java.util.Scanner;

public class CountingSort {

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int num=sc.nextInt();
        System.out.println("enter range of elements of array");
        int range=sc.nextInt();
        int []arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int []result;
        result=countSort(arr,range);
        for(int i:result)
        {
            System.out.print(i+" ");
        }


    }
    public static int[] countSort(int []array,int range)
    {
        int []count=new int[range];
        for(int i=0;i<array.length;i++)
        {
            count[array[i]]++;
        }
        for(int i=1;i<count.length;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        int []result=new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            result[(count[array[i]]--)-1]=array[i];
        }
        return result;

    }
}

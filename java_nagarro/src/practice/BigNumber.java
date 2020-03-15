package practice;

import java.util.*;
public class BigNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long tc =sc.nextLong();
        for(int i=1;i<=tc;i++){
            int n= sc.nextInt();
            long[] arr=new long[n];
            for(int k=0;k<arr.length;k++){
                arr[k]= sc.nextLong();
            }
            bubbleSort(arr);
            for(long val:arr){
                System.out.print(val);
            }
            System.out.println();
        }

    }
    public static void bubbleSort(long[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++)
            {
                if(compareTo(arr[j],arr[j+1])>0){
                    long temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static int compareTo(long i,long j){
        String x=i+""+j;
        String y=j+""+i;
        if(x.compareTo(y)>0)
        {
            return -1;
        }
        else
            return 1;
    }
}

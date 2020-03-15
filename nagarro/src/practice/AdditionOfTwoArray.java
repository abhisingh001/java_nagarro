/**
 * @author Abhishek Singh
 * last update  11:10 PM 22/02/20
 **/
package practice;

import java.util.Scanner;


public class AdditionOfTwoArray {

    public static void main(String[] args) {
        //main starts here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int []arr=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int b=sc.nextInt();
        int []arrb=new int[b];
        for(int i=0;i<arrb.length;i++)
        {
            arrb[i]=sc.nextInt();
        }
        int []sum;
        if(a>=b)
        {
            sum=new int[a+1];
        }
        else
        {
            sum=new int[b+1];
        }
        int i=arr.length-1;
        int j=arrb.length-1;
        int carrry=0,temp;
        int k=sum.length-1;
        while(i>=0 && j>=0)
        {
            temp=arr[i]+arrb[j]+carrry;
            sum[k]=temp%10;
            carrry=temp/10;
            k--;
            i--;j--;
        }
        if(i==-1){
            while(j>=0)
            {
                temp=arrb[j]+carrry;
                sum[k]=temp%10;
                carrry=temp/10;
                j--;k--;
            }

        }
        if(j==-1)
        {
            while(i>=0)
            {
                temp=arr[i]+carrry;
                sum[k]=temp%10;
                carrry=temp/10;
                i--;k--;
            }

        }
        if(carrry!=0 && k>=0)
        {
            sum[k]=carrry;
            k--;
        }
        else
        {
            sum[k]=-1;
        }

        for(k=0;k<sum.length;k++)
        {
            if(sum[k]!=-1)
            System.out.println(sum[k]+", ");
        }
        System.out.println("END");




    }
}

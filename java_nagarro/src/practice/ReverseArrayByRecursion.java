package practice;

/**
 * @author Abhishek Singh
 * last update  7:44 PM 18/02/20
 **/
import java.util.*;
public class ReverseArrayByRecursion {

    public static void main(String[] args) {
        //main starts here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        reverse(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        sc.close();

    }
    public static void reverse(int []z,int start,int end)
    {
        if(start<end) {

            int temp = z[start];
            z[start] = z[end];
            z[end] = temp;

            reverse(z, start+1, end-1);
        }
    }
}

/**
 * @author Abhishek Singh
 * last update  7:57 PM 25/02/20
 **/
package Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        //Starts coding
        System.out.println(fibonacci(50));

    }
    public static int fibonacci(int n)
    {
        if(n==1)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        int b= fibonacci(n-1);
        int a= fibonacci(n-2);
        int c=a+b;
        return c;
    }
}

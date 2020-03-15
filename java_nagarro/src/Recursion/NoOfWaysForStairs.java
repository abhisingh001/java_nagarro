/**
 * @author Abhishek Singh
 * last update  7:30 PM 03/03/20
 **/
package Recursion;

import java.util.Scanner;
//for 1,2 or 3 steps
public class NoOfWaysForStairs {
    public static int noOfWays(int stairs,int steps) {
        if (stairs == 0) {
            return 1;
        }
        if (stairs < 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= steps; i++) {
        sum += noOfWays(stairs - i,steps);
        }
        return sum;
    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of stairs to be trversed");
        int stairs=sc.nextInt();
        System.out.println("enter number of steps to be taken");
        int steps=sc.nextInt();
        System.out.print("total number of ways: "+noOfWays(stairs,steps));

    }
}

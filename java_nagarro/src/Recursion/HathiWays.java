/**
 * @author Abhishek Singh
 * last update  7:49 PM 03/03/20
 **/
package Recursion;

import java.util.Scanner;

public class HathiWays {
    public static int noOfWays(int cr,int cc,int fr,int fc){
        if(cr==fr && cc==fc){
            return 1;
        }
        if(cc>fc || cr>fr){
            return 0;
        }
        int sum=0;
        for(int i=cc+1;i<=fc;i++){
            sum+=noOfWays(cr,i,fr,fc);
        }
        for(int i=cr+1;i<=fr;i++){
            sum+=noOfWays(i,cc,fr,fc);
        }
        return sum;
    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        System.out.println(noOfWays(0,0,4,4));

    }
}

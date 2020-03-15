package practice;

/**
 * @author Abhishek Singh
 * last update  11:26 PM 18/02/20
 **/

import java.util.*;
public class HollowDiamond {

    public static void main(String[] args) {
        //main starts here
        int n=5;

        int space=0;
        int star=n;
        int max=n*2-1;
        int t=n;
        while(star>0)
        {
            int i=1;
            while (i<=star)
            {
                System.out.print("*");
                i++;
            }
            int j=space;
            while(j>0)
            {
                System.out.print(" ");
                j--;
            }
            i=i+space;
            while(i<=max)
            {
                System.out.print("*");
                i++;
            }
            System.out.println();
            if(space==0)
            {
                space=1;
            }
            else
                space=space+2;
            star--;

        }
        star=2;
        space=space-4;


        while (star<=n)
        {
            int i=1;
            while(i<=star)
            {
                System.out.print("*");
                i++;
            }
            int j=space;
            while(j>0)
            {
                System.out.print(" ");
                j--;
            }
            i=i+space;
            while(i<=max)
            {
                System.out.print("*");
                i++;
            }
            System.out.println();
            star++;
            if(space==1)
            {
                space=0;
            }
            else
                space=space-2;



        }

    }
}

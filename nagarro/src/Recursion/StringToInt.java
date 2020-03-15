/**
 * @author Abhishek Singh
 * last update  7:46 PM 29/02/20
 **/
package Recursion;

import java.util.*;

public class StringToInt {
    public static int toInteger(String s,int num){
        if(s.length()==0){
            return num;
        }
        else{
            int n;
            if(s.charAt(0)>='0' && s.charAt(0)<='9'){
               n=s.charAt(0)-48;
               num=num*10 +n;
               return toInteger(s.substring(1),num);
            }
            else {
                System.out.println("error");
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc = new Scanner(System.in);
        try{
            String s=sc.nextLine();
            System.out.println(toInteger(s,0));
            int n=Integer.parseInt(s);
            System.out.println(n);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            sc.close();
        }

    }
}

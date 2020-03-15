/**
 * @author Abhishek Singh
 * last update  10:02 AM 03/03/20
 **/
package BacktrackingP;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static StringBuilder findMin(StringBuilder num,int start){
        if(start>=num.length()){
            if(removeLeadingZeroes(num.toString()).equals("0")){
                return new StringBuilder("99999999999999999");
            }
            return num;
        }
        StringBuilder n=new StringBuilder(num);
        char c=n.charAt(start);
        c=(char)('9'-c+48);
        num.setCharAt(start,c);
        StringBuilder temp=findMin(num,start+1);
        if(temp.compareTo(n)<0){
            return temp;
        }
        else
        {
            return findMin(n,start+1);
        }

    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        StringBuilder numB=new StringBuilder(num);
        String s=removeLeadingZeroes(findMin(numB,0).toString());
        if("0".equals(s)){
            System.out.println(num);
        }
        else{
            System.out.println(s);
        }

    }
    public static String removeLeadingZeroes(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}

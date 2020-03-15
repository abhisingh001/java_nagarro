/**
 * @author Abhishek Singh
 * last update  8:44 PM 03/03/20
 **/
package Recursion;

public class MobileCode {
    public static String getCode(char c){
        switch (c){
            case '1':
                return "abc";
            case '2':
                return "def";
            case '3':
                return "ghi";
            case '4':
                return "jkl";
            case '5':
                return "mno";
            case '6':
                return "pqr";
            case '7':
                return "stu";
            case '8':
                return "vwx";
            case '9':
                return "yz";
            default:
                return "null";
        }
    }

    public static void printSubset(String cur,String res){

        if(cur.length()==0){
            System.out.println(res);
            return;
        }

        printSubset(cur.substring(1),res);
        printSubset(cur.substring(1),res+cur.charAt(0));



    }
    public static void printK(String str,String res){
        if(str.length()==0){
            System.out.println(res);
            return;
        }
        String s=getCode(str.charAt(0));
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            printK(str.substring(1),res+c);
        }
    }

    public static void main(String[] args) {
        //Starts coding
        //printSubset("abc","");
        printK("12","");

    }
}

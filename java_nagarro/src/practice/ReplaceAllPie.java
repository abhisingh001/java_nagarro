/**
 * @author Abhishek Singh
 * last update  3:38 PM 27/02/20
 **/
package practice;

public class ReplaceAllPie {
    public static String replaceStr(String str,String strT,String strW){
        String res="";
        for(int i=0;i<str.length();){
            if((i+strT.length())<=str.length() && str.substring(i,i+strT.length()).equals(strT))
            {
                res+=strW;
                i+=strT.length();


            }
            else {
                res+=str.charAt(i);
                i++;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        //Starts coding

        String a="xabpixx3.15x";
        System.out.println(replaceStr(a,"pi","3.14"));


    }
}

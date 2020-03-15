/**
 * @author Abhishek Singh
 * last update  10:46 PM 28/02/20
 **/
package DynamicProgramming;

public class Fibbonacci {

    public static void main(String[] args) {
        //Starts coding
        long []farray=new long[51];
        System.out.println(fibonacci(50,farray));

    }
    public static long fibonacci(int num,long []farray){
        if(num==0)
        {
            return 0;
        }
        if(num==1)
        {
            return 1;
        }
        if(farray[num]!=0)
        {
            return farray[num];
        }
        else
        {
            farray[num]=fibonacci(num-1,farray)+fibonacci(num-2,farray);
            return farray[num];
        }
    }
}

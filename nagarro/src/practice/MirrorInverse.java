package practice;

/**
 * @author Abhishek Singh
 * last update  2:29 AM 20/02/20
 **/
public class MirrorInverse {

    public static void main(String[] args) {
        //main starts here
        int n=32145;
        isMirrorInv(n);


    }
    public static void isMirrorInv(int n)
    {
        int index=1;
        int rev=0;
        while(n>0)
        {
            int temp=n%10;
            n=n/10;
            rev=rev+index*(int)(Math.pow(10,temp-1));
            index++;
        }
        System.out.println(rev);

    }
}

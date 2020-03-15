package practice;

/**
 * @author Abhishek Singh
 * last update  11:55 PM 18/02/20
 **/
public class HourGlass {

    public static void main(String[] args) {
        //main starts here
        int n=5;
        int space=0;
        int star=n;
        int max=n*2+1;
        int t=n;
        while(star>=0)
        {
            int j=space;
            while(j>0)
            {
                System.out.print(" ");
                j--;
            }


            int i=star;
            while (i>=0)
            {
                System.out.print(i);
                i--;
            }

            i=1;
            while(i<=star)
            {
                System.out.print(i);
                i++;
            }
            System.out.println();
            star--;
            space++;

        }
        star=1;
        space=space-2;


        while (star<=n)
        {
            int j=space;
            while(j>0)
            {
                System.out.print(" ");
                j--;
            }


            int i=star;
            while(i>=0)
            {
                System.out.print(i);
                i--;
            }

            i=1;
            while(i<=star)
            {
                System.out.print(i);
                i++;
            }
            System.out.println();
            star++;
            space--;



        }

    }
}

/**
 * @author Abhishek Singh
 * last update  3:03 PM 27/02/20
 **/
package BacktrackingP;

public class SubSetSum {
    public static void printSubset(int []a,int l){
        for(int i=0;i <l;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void subSet(int setP,int resP,int []set,int []res,int cSum,int reqS)
    {
        if(cSum>reqS){
            return;
        }
        if(cSum==reqS)
        {
            printSubset(res,resP);

        }
        else
        {
            for(int i=setP;i<set.length;i++)
            {
                res[resP]=set[i];
                cSum+=set[i];
                subSet(i+1,resP+1,set,res,cSum,reqS);
                cSum-=set[i];

            }
        }


    }

    public static void main(String[] args) {
        //Starts coding
        int []arr={3,4,7,6,1,8,7};
        int []res=new int[7];
        subSet(0,0,arr,res,0,15);


    }
}

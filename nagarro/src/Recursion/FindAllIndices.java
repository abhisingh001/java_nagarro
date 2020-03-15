/**
 * @author Abhishek Singh
 * last update  7:26 PM 02/03/20
 **/
package Recursion;

import java.util.Scanner;

public class FindAllIndices {
    public static void findAllIndices(int []arr,int start,int element,int []index,int curr){
        if(start>=arr.length || curr>=index.length){
            if(curr<index.length){
                index[curr]=-1;
            }
            return;}
        if(arr[start]==element){
            index[curr]=start;
            curr++;
        }
        findAllIndices(arr,start+1,element,index,curr);





    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int []arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        int []index=new int[len];
        findAllIndices(arr,0,element,index,0);
        int i=0;
        while(index[i]!=-1){
            System.out.print(index[i]+" ");
        i++;
        if(i>=len)
            break;
        }

    }
}

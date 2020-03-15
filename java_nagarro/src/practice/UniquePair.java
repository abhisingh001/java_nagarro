/**
 * @author Abhishek Singh
 * last update  10:49 PM 04/03/20
 **/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class UniquePair {
    public static void findUnique(int []arr){
        Arrays.sort(arr);
        int Xor=arr[0];
        int set_bit_no;
        int x=0,y=0;
        for(int i=1;i<arr.length;i++){
            Xor^=arr[i];
        }
        System.out.println(Xor);
        set_bit_no=Xor & ~(Xor-1);
        System.out.println(set_bit_no);

        for(int i=0;i<arr.length;i++){
            if((arr[i] & set_bit_no )!= 0){
                x=x^arr[i];
            }
            else {
                y=y^arr[i];
            }
        }
        System.out.print(x+" "+y);

    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int []arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        findUnique(arr);

    }
}

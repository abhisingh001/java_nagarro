/**
 * @author Abhishek Singh
 * last update  2:15 PM 12/03/20
 **/
package practice;

import java.util.Scanner;

public class BinarySearchM{
    public static int findNearestElement(int []arr, int key){
        int len=arr.length;
        int start=0;
        int end= len-1;
        int mid=(start+end)/2;
        while (true){
            if(arr[mid]==key){
                return arr[mid];
            }
            if(mid+1>len-1){
                return arr[mid];

            }
            if(mid-1<0){
                return arr[0];

            }
            if(key <arr[mid+1] && key>arr[mid]){
                if((arr[mid+1]-key)>(key-arr[mid])){
                    return arr[mid];
                }
                else
                    return arr[mid+1];

            }
            if(key <arr[mid] && key>arr[mid-1]){
                if((arr[mid]-key)>(key-arr[mid-1])){
                    return arr[mid-1];
                }
                else
                    return arr[mid];



            }
            if(key>arr[mid]){
                start=mid+1;
                mid=(start+end)/2;
            }
            else {
                end=mid-1;
                mid=(start+mid)/2;
            }

        }
    }

    public static void main(String[] args) {
        //Starts coding
        Scanner sc= new Scanner(System.in);
        int key =sc.nextInt();
        int []arr={2,5,6,7,8,8,9};
        System.out.print(findNearestElement(arr,key));

    }
}

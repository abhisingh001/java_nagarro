/**
 * @author Abhishek Singh
 * last update  11:17 PM 05/03/20
 **/
package practice;

import java.util.Arrays;
import java.util.Scanner;

public class DailyCode {

    public static void main(String[] args) {
        //Starts coding
        Scanner sc=new Scanner(System.in);
        int exam=sc.nextInt();
        int []credit=new int[exam];
        for(int i=0;i<exam;i++){
            credit[i]=sc.nextInt();
        }

        Arrays.sort(credit);
        int happy=0;
        int firstExam=credit[0];
        for(int i=1;i<exam;i++){
            if(credit[i]>firstExam){
                happy++;
                firstExam=credit[i];
            }
        }
        System.out.print(happy);


    }
}

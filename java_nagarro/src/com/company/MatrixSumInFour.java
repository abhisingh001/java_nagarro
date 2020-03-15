/**
 * @author Abhishek Singh
 * last update  5:56 PM 04/03/20
 **/
package com.company;

public class MatrixSumInFour {

    public static void main(String[] args) {
        //Starts coding
        int [][]arr={{11,12,13,14,30},{15,16,17,18,40},{19,20,21,22,50},{23,24,25,26,60},{27,28,29,30,70}};
         int rowU=0,rowD=arr.length-1,colL=0,colR=arr[0].length-1;
            int sumAA=0,sumBB=0,sumCC=0,sumDD=0;
         while(rowD>rowU || colL<colR){
             int i=rowU;
             int j=colL+1;
             while(j<colR){
                 sumAA+=arr[i][j];
                 j++;
             }



             i=rowU+1;
             j=colR;
             while (i<rowD){
                 sumBB+=arr[i][j];
                 i++;
             }

             i=rowD;
             j=colR-1;
             while(j>colL){
                 sumCC+=arr[i][j];
                 j--;
             }

             i=rowD-1;
             j=colL;
             while(i>rowU){
                 sumDD+=arr[i][j];
                 i--;
             }
             colL++;
             rowD--;
             rowU++;
             colR--;

         }
        System.out.print(sumAA+" "+sumBB+" "+sumCC+" "+sumDD);

    }
}

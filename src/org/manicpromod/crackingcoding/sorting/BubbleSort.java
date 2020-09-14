package org.manicpromod.crackingcoding.sorting;

/**
 * Created by pmanickam on 9/1/2020 at 7:45 AM
 */
public class BubbleSort {

    public static int[] bubbleSortFunc(int[] unSortedArray){

        for(int j=0;j<unSortedArray.length-1;j++) {
            for(int i=0; i<unSortedArray.length-1;i++){
                if(unSortedArray[i]>unSortedArray[i+1]) {
                    int temp = unSortedArray[i+1];
                    unSortedArray[i+1]=unSortedArray[i];
                    unSortedArray[i]=temp;
                }
            }
        }
        return unSortedArray;
    }

    public static void main(String args[]){
        int unSortedArray[] = {300,500,100,400,600,200};
        int[] iterateArray = bubbleSortFunc(unSortedArray);

        for( int i: iterateArray){

            System.out.println(i);
        }


    }

}

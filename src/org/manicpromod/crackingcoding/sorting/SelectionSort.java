package org.manicpromod.crackingcoding.sorting;

/**
 * Created by pmanickam on 8/30/2020 at 9:52 AM
 *
 * Ex: Array abc = {8,1,3,4,2,0}
 * Smallest at the left right and rest at the right side
 */
public class SelectionSort {

    public static int[] selectionSortNumbers(int[] unSortedArray){

        for(int i=0; i< unSortedArray.length ;i++) {
            int index = i;
            for(int j=i+1;j<unSortedArray.length;j++) {
                if(unSortedArray[j] < unSortedArray[index]) {
                    index = j;
                }
            }
            int temp = unSortedArray[i];
            unSortedArray[i]=unSortedArray[index];
            unSortedArray[index] = temp;
        }
        return unSortedArray ;
    }


    public static void main(String[] args){

        System.out.print("The un sorted numbers are ");
        int[] unSortedArray = {5,1,3,2,4};
        for( int i : unSortedArray) {

            System.out.print(i);
        }
        int[] sortedArray = selectionSortNumbers(unSortedArray);
        System.out.println(" ");
        System.out.print("The un sorted numbers are ");
        for( int i : sortedArray) {

            System.out.print(i);
        }

    }


}

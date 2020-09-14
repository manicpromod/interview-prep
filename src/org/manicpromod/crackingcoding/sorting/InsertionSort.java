package org.manicpromod.crackingcoding.sorting;

/**
 * Created by pmanickam on 9/1/2020 at 11:23 AM
 */
public class InsertionSort {

    public static int[] insertionSorted(int[] a){

        for(int i=1; i<a.length;i++){

            int temp = a[i];
            int j=i-1;

            while(j>=0 && a[j] > temp) {

                a[j+1]=a[j];
                j--;
            }

            a[j+1] = temp;

        }
        return a;
    }

    public static void main(String[] args){

        int[] abc = {4,3,1,5,2,0};

        int[] xyz = insertionSorted(abc);

        for(int i : xyz){

            System.out.print(i);
        }


    }
}

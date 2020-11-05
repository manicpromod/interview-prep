package org.manicpromod.crackingcoding.linkedlist;

/**
 * Created by pmanickam on 10/18/2020 at 8:02 PM
 */
public class PrintKElement {

    public static int printElementsRev(int[] array,int size) {
        if(size <1) {
            return 0;
        }
        int value = printElementsRev(array,size);
        System.out.println(array[size]);
        size--;
        return value;
    }

    public static void main(String[] args) {

        int[] array = new int[] {1,2,3,4,5};
        printElementsRev(array,5);

    }

}

package org.manicpromod.crackingcoding.search;

/**
 * Created by pmanickam on 9/10/2020 at 8:46 AM
 */
public class BinarySearch {


    public static void binarySearchRecursion(int[] A, int low, int high,int target){

        int mid = (low+high)/2;
        if(A[mid] == target) {
            System.out.println("The target index is found as " + mid);
            return;
        } else if(A[mid] > target) {
            binarySearchRecursion(A,0,mid-1,target);
        } else {
            binarySearchRecursion(A,mid+1,A.length-1,target);
        }
        System.out.println("The target is not found in the array");
        return;
    }

    public static void main(String[] args){

        int[] A = {10,11,12,13,14,15,16};
        binarySearchRecursion(A,0,A.length-1,155);;
    }

}

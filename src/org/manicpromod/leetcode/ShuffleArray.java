package org.manicpromod.leetcode;

/**
https://leetcode.com/problems/shuffle-the-array/

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
Example 3:

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
**/

class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        
        int[] leftNums = new int[nums.length];
        int[] rightNums = new int[nums.length];
        int [] mergeNums = new int[nums.length];
        
        for(int i=0;i<n;i++){
            leftNums[i] = nums[i];
            
        }
        
        for(int j=n,k=0;j<nums.length;j++,k++){
            rightNums[k] = nums[j];            
        }
        
        for(int k=0,j=0,i=0; k<nums.length;k = k+2,i++,j++){
            
            mergeNums[k] = leftNums[i];
            mergeNums[k+1] = rightNums[j];

        }
        
        return mergeNums;
                
    }
}

package com.manicpromod.leetcode;

/** https://leetcode.com/problems/perfect-squares/
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

Example 1:

Input: n = 12
Output: 3 
Explanation: 12 = 4 + 4 + 4.

**/
class PerfectSquares {
    public int numSquares(int n) {
        int[] min =  new int[n+1];
        min[1] = 1;
        for(int i=2;i<=n;i++) {
            int tmp = Integer.MAX_VALUE;
            for(int j=1; j*j<=i;j++){
                tmp = Math.min(tmp,min[i-j*j]+1);
            }
            min[i] = tmp;
        }
        
        return min[n];
        
    }
}




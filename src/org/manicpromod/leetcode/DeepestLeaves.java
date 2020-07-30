package org.manicpromod.leetcode;

import javax.swing.tree.TreeNode;

/**
https://leetcode.com/problems/deepest-leaves-sum/
Given a binary tree, return the sum of values of its deepest leaves.
 


Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
Output: 15
Iterative Method
**/
class DeepestLeaves {
    public int deepestLeavesSum(TreeNode root) {
        
        int leftVal = 0;
        int rightVal = 0;
        TreeNode temp = root;  
        while(root.left != null) {
             
           root = root.left; 
           leftVal = root.val;
            
        }    
                  
        while(temp.right != null) {
             
           temp = temp.right; 
           rightVal = temp.val;
            
        }
      
        
        return leftVal+rightVal;
        
    }

    class TreeNode {

        public int val;
        public TreeNode left,right;
    }
}

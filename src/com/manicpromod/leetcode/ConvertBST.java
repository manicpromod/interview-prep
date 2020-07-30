package com.manicpromod.leetcode;

/**
https://leetcode.com/problems/convert-bst-to-greater-tree/
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

Example:

Input: The root of a Binary Search Tree like this:
              5
            /   \
           2     13

Output: The root of a Greater Tree like this:
             18
            /   \
          20     13
Note: This question is the same as 1038: https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

**/
class ConvertBST {
    private int sum = 0;

    public TreeNode CBST (TreeNode root) {
        if (root != null) {
            CBST(root.right);
            sum += root.val;
            root.val = sum;
            CBST(root.left);
        }
        return root;
    }
    class TreeNode {

        public int val;
        public TreeNode left,right;
    }

}

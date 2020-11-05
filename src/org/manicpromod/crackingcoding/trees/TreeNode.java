package org.manicpromod.crackingcoding.trees;

/**
 * Created by pmanickam on 11/4/2020 at 8:13 AM
 */
public class TreeNode {
   int data;
   TreeNode left;
   TreeNode right;

   public void TreeNode() {

   }

   public void TreeNode(int data){
       this.data = data;
   }

   public void TreeNode(int data, TreeNode left, TreeNode right) {

       this.data = data;
       this.left = null;
       this.right = right;
   }


}

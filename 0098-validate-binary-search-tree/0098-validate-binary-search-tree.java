/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        return find(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }

    public boolean find(TreeNode root,long max,long min)
    {
        if(root==null)return true;
        if((root.val>=max) || (root.val<=min))return false;
        

        return find(root.left,root.val,min) && find(root.right,max,root.val);
    }
}
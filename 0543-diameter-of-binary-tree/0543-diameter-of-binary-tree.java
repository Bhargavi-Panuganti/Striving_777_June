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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;

        find_dia(root);

        return max;
    }

    int find_dia(TreeNode root)
    {
        if(root==null)return 0;

        int lh=find_dia(root.left);
        int rh=find_dia(root.right);
        max=Math.max(max,lh+rh);

        return 1+Math.max(lh,rh);
    }
}
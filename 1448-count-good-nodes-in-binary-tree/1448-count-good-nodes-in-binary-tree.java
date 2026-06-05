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
    int count=0;
    public int goodNodes(TreeNode root) {
        count=0;
        inorder(root, Integer.MIN_VALUE);
        return count;
    }

    private void inorder(TreeNode root, int max)
    {
        if(root==null)return;
        if(root.val>=max)count++;

        inorder(root.left, (int)Math.max(max,root.val));

        inorder(root.right, (int)Math.max(max,root.val));
    }
}
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
    int small_node=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)return 0;
        find_small_node(root,k);
        return small_node;
    }

    public void find_small_node(TreeNode root,int k)
    {
        if(root==null)return;

        find_small_node(root.left,k);
        count++;
        if(count==k){
            small_node=root.val;
            return;
        }
        find_small_node(root.right,k);
    }
}
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

 // For Right view we will follow reverse preorder i.e root--right--left
 // and for Left view root--left--right
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ds=new ArrayList<>();
        if(root==null)return ds;
        track(root,0,ds);
        return ds;
    }

    public void track(TreeNode root,int level,List<Integer> ds)
    {
        if(root==null)return;
        
        if(level==ds.size())ds.add(root.val);
        track(root.right,level+1,ds);
        track(root.left,level+1,ds);
    }
}
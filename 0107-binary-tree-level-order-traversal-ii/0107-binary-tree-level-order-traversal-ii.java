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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            ArrayList<Integer> arr=new ArrayList<>();
            int level=q.size();
            for(int i=0;i<level;i++)
            {
                TreeNode temp=q.peek();
                if(temp.left!=null)
                {
                    q.add(temp.left);

                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                arr.add(q.peek().val);
                q.remove();
            }
            ans.add(arr);
        }
        Collections.reverse(ans);
        return ans;
    }
}
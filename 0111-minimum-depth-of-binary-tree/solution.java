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
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int c=q.size();
            while(c!=0){
                TreeNode cur = q.poll();
                if((cur.left==null)&&(cur.right==null)){
                    return level+1;
                }
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
                c--;
            }
            ++level;
        }
        return 0;
    }
}

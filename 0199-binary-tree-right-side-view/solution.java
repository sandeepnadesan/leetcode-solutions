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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>res=  new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> v= new ArrayList<>();
            int c=q.size();
            while(c!=0){
                TreeNode cur = q.poll();
                v.add(cur.val);
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
                c--;

            }
            res.add(v.get(v.size()-1));
        }
        return res;
    }
}

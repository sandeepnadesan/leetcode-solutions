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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int flag=1;
        while(!q.isEmpty()){
            List<Integer> v = new ArrayList<>();
            int c=q.size();
            System.out.println(c);
            while(c!=0){
                TreeNode cur= q.poll();
                v.add(cur.val);
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
                c--;
                System.out.println(v);
            }
            if(flag==0)Collections.reverse(v);
            flag=(flag==0)?1:0;
            res.add(v);
            System.out.println(res);
        }
        
        return res;
    }
}

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
    private int cc(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+cc(root.left)+cc(root.right);
    }


    public int countNodes(TreeNode root) {
        int c= cc(root);
        return c;
    }
}

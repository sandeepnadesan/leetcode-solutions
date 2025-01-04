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
    private int height(TreeNode root){
        if(root == null)return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int a=Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        int count =height(root.right)+height(root.left);
        System.out.println(a);
        System.out.println(count);
        return Math.max(a,count);
        
    }
}

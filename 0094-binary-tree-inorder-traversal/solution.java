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
    private void inorder(TreeNode root,List<Integer> a){
        if(root==null)return;
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a= new ArrayList<>();
        inorder(root,a);
        return a;     
    }
}

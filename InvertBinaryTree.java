//link: https://leetcode.com/problems/invert-binary-tree/
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
class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        invert(root);
        return root;
    }
    public boolean invert(TreeNode root){
        if(root==null)
            return false;
        if(root.left==null&&root.right==null){
            return true;
        }
        boolean t1= invert(root.left);
        boolean t2=invert(root.right);
        if(t1||t2){
            TreeNode x=root.left;
            root.left=root.right;
            root.right=x;
        }
        return true;
    }
}
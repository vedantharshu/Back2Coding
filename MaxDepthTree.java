//link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
//Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
    }
}

public class MaxDepthTree {
    public int maxDepth(TreeNode root) {
            return depth(root, 1);
    }
    public int depth(TreeNode root, int dpth){
        if(root==null)
            return dpth-1;
        if(root.left==null && root.right==null)
            return dpth;
        return Math.max(depth(root.left,dpth+1), depth(root.right, dpth+1));
    }
}
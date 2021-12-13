/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val==root.val||q.val==root.val)
            return root;
            boolean l=LCA(root.left,p,q);
            boolean r=LCA(root.right,p,q);
            if(r&&l)
                return root;
            else if(r)
                return lowestCommonAncestor(root.right,p,q);
            else
                return lowestCommonAncestor(root.left,p,q);
    }
    public boolean LCA(TreeNode root, TreeNode n, TreeNode m){
        if(root==null)
            return false;
        if(root.val==n.val||root.val==m.val||LCA(root.left,n,m)||LCA(root.right,n,m))
            return true;
        return false;
    }
}
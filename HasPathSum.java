//link: https://leetcode.com/problems/path-sum/
// Definition for a binary tree node.
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
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return ans(root, targetSum, 0);
    }
    public boolean ans(TreeNode root, int target, int sum){
        if(root==null)
            return false;
        sum+=root.val;
        if(root.left==null&&root.right==null){
            if(sum==target)
                return true;
            return false;
        }
        return ans(root.left, target, sum)||ans(root.right, target, sum);
    }
}
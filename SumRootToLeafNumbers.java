//link: https://leetcode.com/problems/sum-root-to-leaf-numbers/submissions/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { 
        this.val = val; 
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return check(root,0);
    }
    
    public int check(TreeNode root, int v){
        if(root ==  null)
            return 0;
        v=v*10+root.val;
        if(root.left==null && root.right==null){
            return v;
        }
        return check(root.left, v) + check(root.right, v);
    }
}

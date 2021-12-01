//link: https://leetcode.com/problems/count-complete-tree-nodes/
class TreeNode {
    TreeNode left;    
    TreeNode right;
    int val;
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

class CountCompleteTreeNodes {
    int count = 0;
    public int countNodes(TreeNode root) {
        check(root);
        return count;
    }
    public void check(TreeNode root){
        if(root == null)
            return;
        else{
            count++;
        }
        if(root.left!=null){
            check(root.left);
        }
        else
            return;
        if(root.right!=null){
            check(root.right);
        }
        else
            return;
    }
}

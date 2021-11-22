class Node{
    Node left;
    Node right;
    int key;
    Node(){
        left = null;
        right = null;
        key=0;
    }
    Node(Node left, Node right, int key){
        this.left=left;
        this.right=right;
        this.key=key;
    }
}

public class BasicTree{
    static Node root=null;
    public static void main (String args[]){
        System.out.println("add element val");
        addNode();
        addNode();
        display(root);
    }
    public static void display(Node root){
        if(root!=null){
            display(root.left);
            System.out.println(root.key);
            display(root.right);
        }
    }
    public static void addNode(){
        if(root==null){
            root=new Node(null,null,5);
        }
        else{
            root.left=new Node(null,null,7);
            root.right=new Node(null,null,6);
        }
    }
}
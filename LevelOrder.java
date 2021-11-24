import java.util.*;
class Node1{
    Node1 left;
    Node1 right;
    int key;
    Node1(){
        left = null;
        right = null;
        key=0;
    }
    Node1(Node1 left, Node1 right, int key){
        this.left=left;
        this.right=right;
        this.key=key;
    }
}

public class LevelOrder{
    static Node1 root=null;
    public static void main (String args[]){
        System.out.println("add element val");
        addNode1();
        addNode1();
        display(root);
        System.out.println("\n Level");
        displayLevel(root);
    }
    public static void displayLevel(Node1 root){
        Queue<Node1> queue = new LinkedList<Node1>();
        Queue<Node1> child = new LinkedList<Node1>();
        queue.add(root);
        while(true){
            while(!queue.isEmpty()){
                Node1 ele=queue.poll();
                System.out.print(ele.key+" ");
                if(ele.left!=null)
                    child.add(ele.left);
                if(ele.right!=null)
                    child.add(ele.right);
            }
            System.out.println();
            queue=new LinkedList<>(child);
            child.clear();
            if(queue.isEmpty())
                break;
        }
    }
    public static void display(Node1 root){
        if(root!=null){
            display(root.left);
            System.out.println(root.key);
            display(root.right);
        }
    }
    public static void addNode1(){
        if(root==null){
            root=new Node1(null,null,1);
        }
        else{
            root.left=new Node1(null,null,2);
            root.right=new Node1(null,null,3);
            root.left.left=new Node1(null,null,4);
            root.left.right=new Node1(null,null,5);
            root.right.right=new Node1(null,null,6);
            root.left.right.left=new Node1(null,null,7);
            root.left.right.right=new Node1(null,null,8);
        }
    }
}
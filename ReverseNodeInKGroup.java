//link: https://leetcode.com/problems/reverse-nodes-in-k-group/

///Definition for singly-linked list.
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseNodeInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead=head;
        ListNode newNode=null;
        int c=0;
        Stack<ListNode> stack = new Stack<>();
        while(true){
            if(c!=k&&newHead==null)
                break;
            if(c==k||newHead==null){
                c=0;
                while(!stack.isEmpty()){
                    ListNode st = stack.pop();
                    if(newNode==null){
                        head=st;
                        newNode=head;
                        continue;
                    }
                    newNode.next=st;
                    newNode=st;
                }
                newNode.next=newHead;
                if(newHead==null)
                    break;
            }
            else{
                ++c;
                stack.push(newHead);
                newHead=newHead.next;
            }
        }
        return head;
    }
}
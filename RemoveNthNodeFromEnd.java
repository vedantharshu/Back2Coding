//Definition for singly-linked list.
//Link:https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tHead= head;
        int size=0;
        while(tHead!=null){
            size++;
            tHead=tHead.next;
        }
        tHead=head;
        if(size==1)
            return null;
        if(size==n)
            return head.next;
        ListNode prev=null;
        for(int i=0;i<size-n;i++){
            prev=tHead;
            tHead=tHead.next;
        }
        prev.next=tHead.next;
        tHead.next=null;
        return head;
    }
}
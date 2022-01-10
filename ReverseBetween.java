//link: https://leetcode.com/problems/reverse-linked-list-ii/

//This problem could have been solved with stack, but the challenge was not to use extra space, also to traverse the list once.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
   
   public class ReverseBetween {
       public static void main(String args[]){
           ListNode head = null;
           ListNode node=new ListNode(1,null);
           head = node;
           node.next=new ListNode(2,null);
           node.next.next=new ListNode(3,null);
           node.next.next.next=new ListNode(4,null);
           node.next.next.next.next=new ListNode(5,null);
           ListNode st = reverseBetween(head, 1, 5);
           while(st!=null){
               System.out.println(st.val);
               st=st.next;
           }
       }
       public static ListNode reverseBetween(ListNode head, int left, int right) {
           //if start and end index are same reverse is trivial
           if(left==right)
               return head;
           int i=1;
           // prevStart : for storing node before the start index
           //start: for storing node at start index;
           // current: node for traversing
           //node: look ahead node
           ListNode prevStart=null, start=null, prev=null, current=head, node = null;
           for(i=1;i<left;i++){
               prevStart=current;
               current=current.next;
           }
           start = current;
           node= start.next;
           while(i!=right+1){
               if(prev!=null)
                   current.next=prev;
               prev=current;
               current = node;
               if(node!=null)
                   node = node.next;
               ++i;
           }
           if(prevStart!=null)
               prevStart.next=prev;
           else
               head=prev;
           start.next=current;
           return head;
       }
   }
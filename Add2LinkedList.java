//link: https://leetcode.com/problems/add-two-numbers/

//Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 

public class Add2LinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=l1;
        ListNode h2=l2;
        ListNode ans=null,head=null;
        int len1=0, len2=0;
        while(h1!=null){
            ++len1;
            h1=h1.next;
        }
        while(h2!=null){
            ++len2;
            h2=h2.next;
        }  
        h1=l1;
        h2=l2;
        if(len1<len2){
            h1=l2;
            h2=l1;
        }
        int l = Math.min(len1, len2);
        int i;
        int carry=-1, sum=0;
        for(i=0;i<l;i++){
            sum=h1.val+h2.val;
            if(carry!=-1)
                sum=sum+carry;
            int val=sum%10;
                carry=sum/10;
            if(ans==null){
                ans=new ListNode(val,null);
                head=ans;
            }else{
                ans.next=new ListNode(val,null);
                ans=ans.next;
            }
            h1=h1.next;
            h2=h2.next;
        }
        int dif=Math.abs(len2-len1);
        for(i=0;i<dif;i++){
            sum=carry+h1.val;
            int val=sum%10;
            carry=sum/10;
            ans.next=new ListNode(val, null);
            ans=ans.next;
            h1=h1.next;
        }
        if(carry==1)
            ans.next=new ListNode(carry, null);
        return head;
    }
}
package org.example;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Test {

    public static void main(String[] args) {
        ListNode l1=new ListNode(0);
        ListNode l2 = new ListNode(1);

        ListNode res=new ListNode(0);
        int rem=0;
        while(l1!=null || l2!=null || rem!=0){
            int a=l1==null?0:l1.val;
            int b=l2==null?0:l2.val;
            int sum=a+b+rem;
            ListNode tempNode=new ListNode(sum/10);
            res.next=tempNode;
            res=tempNode;
            rem=sum%10;
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }

    }
}

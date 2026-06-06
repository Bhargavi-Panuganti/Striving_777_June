/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null)
        {
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    static void mergelists(ListNode list1, ListNode list2)
{
    while (list2 != null) {
        ListNode temp1 = list1.next;
        ListNode temp2 = list2.next;

        list1.next = list2;
        if (temp1 == null) break; 
        list2.next = temp1;

        list1 = temp1;
        list2 = temp2;
    }
}

    public void reorderList(ListNode head) {
       if(head==null || head.next==null)return;
       ListNode prev=head;
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null)
       {
        prev=slow;
        slow=slow.next;
        fast=fast.next.next;
       } 
       prev.next=null;
       ListNode first=head;
       ListNode sec=reverse(slow);
       mergelists(first,sec);
    }
}
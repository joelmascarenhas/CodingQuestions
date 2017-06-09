package Leetcode;

/**
 * Created by Joel on 06-06-2017.
 */
public class LC2_AddTwoNumbers {
    private static int carry = 0;
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        //l2.next.next = new ListNode(9);

        ListNode head = addTwoNumbers(l1,l2);
        while(head != null)
        {
            System.out.print(head.val + "  -->  ");
            head = head.next;
        }

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = null;
        ListNode current = null;
        if(l1 == null && l2 == null)
        {
            newHead = null;
            return newHead;
        }
        else if(l1 == null)
        {
            newHead = l2;
            return newHead;
        }
        else if(l2 == null)
        {
            newHead = l1;
            return newHead;
        }
        else
        {
            int sum = l1.val + l2.val;
            carry = 0;
            if(sum >= 10)
            {
                newHead = new ListNode(sum%10);
                carry = sum/10;
            }
            else
                newHead = new ListNode(sum%10);

            current = newHead;
            l1 = l1.next;
            l2 = l2.next;
            while(l1 != null && l2!= null)
            {
                sum = l1.val + l2.val;
                if(carry > 0)
                    sum = sum + carry;

                ListNode temp = new ListNode(sum%10);
                carry = sum/10;

                l1 = l1.next;
                l2 = l2.next;
                current.next = temp;
                temp.next = null;
                current = temp;
            }
            if(l1 == null && l2 == null)
            {
                handleCarry(current);
            }
            else if(l1 == null)
            {
                current = handleRemainderList(l2,current);
                handleCarry(current);
            }
            else
                {
                    current = handleRemainderList(l1,current);
                    handleCarry(current);
                }
        return newHead;
        }
    }
    public static void handleCarry(ListNode current)
    {
        if (carry > 0) {
            ListNode temp = new ListNode(carry);
            temp.next = null;
            current.next = temp;
            current = temp;
        }
    }
    public static ListNode handleRemainderList(ListNode lx,ListNode current)
    {
        int sum;
        while(lx != null)
        {
            sum = lx.val + carry;
            ListNode temp = new ListNode(sum%10);
            carry = sum/10;
            lx = lx.next;
            temp.next = null;
            current.next = temp;
            current = temp;
        }
        return current;
    }
}

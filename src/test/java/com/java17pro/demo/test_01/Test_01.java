package com.java17pro.demo.test_01;

public class Test_01 {
    public static void main(String[] args) {
        // System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd
        // HH:mm:ss")));
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;// 进位
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}

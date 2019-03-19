// 两个链表的第一个公共结点

// 题目描述:
// 输入两个链表，找出它们的第一个公共结点。

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
// 思路：两个指针，依次走两个链表，因为两个链表共用尾部，所以最后相同时，不是在空指针就是在第一个公共结点
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if(pHead1 == null || pHead2 == null)return null;
        ListNode p = pHead1;
        ListNode q = pHead2;
        while(p != q){
            if(p.next == null && q.next == null)return null;
            p = (p.next == null) ? pHead2 : p.next;
            q = (q.next == null) ? pHead1 : q.next;
        }
        return p;
    }
}
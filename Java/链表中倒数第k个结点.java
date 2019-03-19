// 链表中倒数第k个结点

// 题目描述:
// 输入一个链表，输出该链表中倒数第k个结点。

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/


public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k <= 0) return null;
        ListNode p = head;
        ListNode q = head;

        for(int i = 0; i < k-1; i++){       //排除 k 大于整个链表长度的情况，并且找到距离head长度为k的结点
            if(q.next != null){
                q = q.next;
            }else{
                return null;
            }
        }

        while(q.next != null){
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
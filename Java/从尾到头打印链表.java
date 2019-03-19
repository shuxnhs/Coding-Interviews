// 面试题6：从尾到头打印链表


/**
 * 题目描述：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */



// 方法一 ：暴力
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
// 方法一：若对修改链表内容没有限制
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        ListNode first = new ListNode(0);
        ListNode p = listNode;
        ListNode tmp = null;
        // 反转整个链表
        while(p != null){
            tmp = p;
            p = p.next;
            tmp.next = first.next;
            first.next = tmp;
        }

        // 按顺序输出整个反转之后的链表
        p = first.next;
        while(p != null){
            result.add(p.val);
            p = p.next;
        }
        return result;
    }
}

// 方法二：若不允许修改链表结构(使用一个栈来保存遍历的内容)
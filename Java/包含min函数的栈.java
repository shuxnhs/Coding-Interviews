// 包含min函数的栈

// 题目描述:
// 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。

import java.util.Stack;

// 思路：使用一个辅助栈，记录数据栈中，小于当前元素的最小值，这样需要取最小值时，只需要从minItem栈中取出即可
public class Solution {
    
    public void push(int node) {
        data.push(node);
        if(minItem.isEmpty() || minItem.peek() > node) minItem.push(node);
        else minItem.push(minItem.peek()); 
    }
    
    public void pop() {
        data.pop();
        minItem.pop();
    }
    
    public int top() {
        return data.peek();     //查看栈的第一个元素
    }
    
    public int min() {
        return minItem.peek();
    }

    private Stack<Integer> data = new Stack();
    private Stack<Integer> minItem = new Stack();
}
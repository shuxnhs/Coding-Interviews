// 二进制中1的个数

// 题目描述
// 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

public class Solution {
    public int NumberOf1(int n) {
        int counter = 0;
        while(n != 0){
            if((n & 1) == 1)counter++;
            n = n >>> 1;        // 移位操作>>> : 最高位补0
        }
        return counter;
    }
}
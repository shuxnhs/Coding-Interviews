// 斐波那契数列

// 题目描述:
// 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
// n<=39

public class Solution {
    public int Fibonacci(int n) {
        if(n == 0)return 0;
        if(n < 3)return 1;
        int n2 = 1;     // 表示 f(n-2)
        int n1 = 1;     // 表示 f(n-1)
        int tmp = 0;
        for(int i = 2; i < n; i++){
            tmp = n2 + n1;
            n2 = n1;
            n1 = tmp;
        }

        return n1;
    }
}
// 求1+2+3+...+n


// 题目描述
// 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

public class Solution {
    public int Sum_Solution(int n) {
        
        int sum = n;
        boolean ans = (sum>0) && (sum += Sum_Solution(n-1)) > 0;    //利用“&&”符号的短路规则，完成递归的跳出功能
        return sum;
    }
}
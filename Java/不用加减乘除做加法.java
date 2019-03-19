// 不用加减乘除做加法

// 题目描述:
// 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。

// 思路：“异或”：各位数相加，不管进位；   “相与”：找到两位数为“1”(即需要进位)，之后左移移位，计算出进位之后的结果
//       循环上面两个步骤，之后记录进位的数为“0”，则跳出循环
public class Solution {
    public int Add(int num1,int num2) {

        // if(num1 == num2)return num1<<1;

        while(num2 != 0){
            int tmp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = tmp;
        }
        return num1;
    }
}
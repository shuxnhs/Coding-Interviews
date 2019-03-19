// 变态跳台阶
// 题目描述
// 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。


// 思路：
// 按照青蛙第一次跳多少台阶来进行分类
// f(n) = f(n-1) + f(n-2) + f(n-3) +...f(1)
// f(n-1) = f(n-2) + f(n-3) + f(n-4) +...f(1)
// f(n) = 2f(n-1)

// 解法一：递归法
public class Solution {
    public int JumpFloorII(int target) {
        if(target == 0 || target == 1)return target;
        return 2*JumpFloorII(target - 1);
    }
}

// 解法二：非递归法
public class Solution {
    public int JumpFloorII(int target) {
        if(target == 0 || target == 1)return target;
        
        int i = 1;
        int res = 1;
        while(i < target){
            res = 2 * res;
            i++;
        }
        return res;
    }
}

// 解法三：移位
public class Solution {
    public int JumpFloorII(int target) {
        if(target == 0 || target == 1)return 1;
        return 1 << (target-1);
    }
}
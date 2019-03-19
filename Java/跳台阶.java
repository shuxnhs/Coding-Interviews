// 跳台阶


/**
 * 题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */



// 方法一 ：动态规划
public class Solution {
    public int JumpFloor(int target) {
        if(target == 0 || target == 1 || target == 2)return target;
        int i1 = 1;
        int i2 = 2;
        int tmp = 0;
        for(int i = 3; i <= target; i++){
            tmp = i1 + i2;
            i1 = i2;
            i2 = tmp;
        }
        return tmp;
    }
}
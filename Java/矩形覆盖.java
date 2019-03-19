// 矩形覆盖

// 题目描述
// 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？


// 思路： f(n) = f(n-1) + f(n-2)
public class Solution {
    public int RectCover(int target) {
        if(target < 3)return target;

        int n2 = 1;
        int n1 = 2;
        int tmp = 0;
        int i = 2;
        while(i < target){
            tmp = n2 + n1;
            n2 = n1;
            n1 = tmp;
            i++;
        }
        return n1;
    }
}
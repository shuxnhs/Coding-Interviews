// 数字在排序数组中出现的次数

// 题目描述:
// 统计一个数字在排序数组中出现的次数。

// 方法一：找到其中一个k，从这个k开始往两边进行扩展
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        // if(array.length == 0)return 0;                  // 判断数组长度为0或者1的情况(不判断也可以，程序可以自动完成，但是在本例题中，由于案例的原因，先进行判断可以提升速度)
        // if(array.length == 1 && array[0] == k)return 1; 

        int point = getK(array, k, 0, array.length-1);      // 二分查找，找到等于k的一个位置
        if(point == -1)return 0;
        int counter = 1;
        
        for(int i = point-1; i > -1; i--){                  // 从找到的位置往前遍历
            if(array[i] == k)counter++;
            else break;
        }
        for(int i = point+1; i < array.length; i++){        // 从找到的位置往后遍历
            if(array[i] == k)counter++;
            else break;
        }
        return counter;

    }

    private int getK(int [] array , int k, int start, int end){
        if(start > end)return -1;

        int mid = (start + end)/2;
        if(k == array[mid])return mid;
        else if(k < mid)return getK(array, k, start, mid-1);
        else return getK(array, k, mid+1, end);
    }
}
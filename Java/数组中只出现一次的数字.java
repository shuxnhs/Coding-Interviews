// 数组中只出现一次的数字

// 题目描述:
// 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果

// 思路：首先所有数进行异或操作，得到结果为两个只出现一次的数的异或值(res)
// 找到这个(res)值的二进制形式的得第一个出现“1”的位置(从左往右数)
// 将数组中的数按照这个位置上面的值是“0”还是“1”，分成两部分，其中这两部分分别有一个数只出现一次，其他的数都出现偶数次
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {

        if(array == null || array.length < 2)return;

        int res = array[0];                     //求出两个只出现一次的数的异或值
        for(int i = 1; i < array.length; i++){
            res = res ^ array[i];
        }
        
        int tmp = res;                          // 求出异或的结果的二进制形式的第一个“1”的位置(从左往右数)
        int counter = 0;
        while((tmp&1) != 1){
            tmp = tmp >>> 1;
            counter++;
        }
        
        num1[0] = 0;
        num2[0] = 0;
        for(int i = 0; i < array.length; i++){  //按第一个出现“1”的位置(上部分找到)上是“0”或“1”将整个数组中的数分成两部分
            tmp = 0;
            tmp = array[i] >>> counter;
            
            if((tmp & 1) == 1)num1[0] = num1[0] ^ array[i];     // 分别异或
            else num2[0] = num2[0] ^ array[i];
        }
    }
}
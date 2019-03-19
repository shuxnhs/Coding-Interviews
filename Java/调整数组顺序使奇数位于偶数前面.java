// 调整数组顺序使奇数位于偶数前面

// 题目描述
// 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
// 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

// 思路：新开一个数组，遇到偶数，按顺序放到新数组，最后将两个数组合并
public class Solution {
    public void reOrderArray(int [] array) {
        int counter = 0;
        int p = 0;
        int[] evenNumber = new int[array.length];

        for(int i = 0; i < array.length; i++){      //新开一个数组，遇到偶数，按顺序放到新数组，
            if(array[i] % 2 == 0){
                evenNumber[counter++] = array[i];
            }else{
                array[p++] = array[i];              //遇到奇数，则将值赋给最前面空出来的位置
            }
        }

        for(int i = 0; i < counter; i++){
            array[p++] = evenNumber[i];
        }
    }
}
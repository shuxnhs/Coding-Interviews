// 数组中出现次数超过一半的数字

// 题目描述
// 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
// 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {

        if(array.length == 1)return array[0];

        int tmp = array[0];
        int counter = 1;
        for(int i = 1; i < array.length; i++){      // 两个不同的数字进行抵消，最后一个数字就是个数过半的数字
            if(array[i-1] == array[i]){             // 前后两个相等，出现次数+1
                counter++;
            }else if(counter > 1){                  // 前后两个不等，出现次数>1时，次数-1
                counter--;
            }else if(i == array.length-1){          // 前后两个不等，出现次数=1时，而且比较的是最后一个元素和倒数第二个元素，此时表示没有超过个数一半的数字
                return 0;
            }else{                                  // 前后两个不等，出现次数=1时，此时从新获取新数字，继续遍历
                tmp = array[i+1];
                i++;
            }
        }

        int cou = 0;
        for(int num : array){                       // 确认最后获取到的数字，确实是个数超过一半，排除没有次数超过一半的数字
            if(num == tmp)cou++;
        }
        if(cou > array.length/2)return tmp;
        return 0;
    }
}
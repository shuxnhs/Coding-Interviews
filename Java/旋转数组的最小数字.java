// 旋转数组的最小数字

// 题目描述:
// 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
// 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，
// 该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。


// 方法一：暴力解法
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)return 0;

        int min = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < array[min]) min = i;
        }
        return array[min];
    }
}


// 方法二：
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)return 0;
        if(array.length == 1)return array[0];

        int head = array[0];

        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        while(start < end - 1){     // 最终两个指针将指向相邻两个元素(start指向前半部分数组最大的，end指向后半部分最小的)
            mid = (start + end)/2;
            if(array[mid] > head) start = mid;
            else end = mid;
        }
        return array[end];  
    }
}
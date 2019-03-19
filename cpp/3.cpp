//
// Created by HXH on 2019/3/13.
// 面试题3：数组中重复的数字
//
#include<iostream>
using namespace std;
class Solution{
public:

    /*
     * numbers       数组
     * length        数组长度
     * duplication   存放重复的数字
     * @return true  表示数组中有重复的数字
     * @return false 表示数组中没有重复数字
     */
    bool duplicate(int numbers[], int length, int *duplication){

        //长度小于等于0或者numbers为空
        if(length <= 0 || numbers == nullptr){
            return false;
        }

        //数组中有小于0，或者大于length的
        for(int i=0 ;i<length; i++ ){
            if(numbers[i] < 0 || numbers[i] > length-1){
                return  false;
            }
        }

        for(int j=0; j<length; j++)
        {
            while ( numbers[j] != j)
            {

                //判断j与numbers[j]对应的位置的数是否相等，相等则是重复的
                if( numbers[numbers[j]] == numbers[j] ){
                    *duplication = numbers[j];
                    return true;

                }else
                {
                    //交换
                    int temp = numbers[j];
                    numbers[j] = numbers[temp];
                    numbers[temp] = temp;
                }

            }

        }
        return false;


    }
};
int main(){
    Solution solution;
    int a[10]= {8, 9, 2, 3, 8, 7, 0, 9, 3, 5};
    int b[10] = {0,0,0,0,0,0,0,0,0,0};
    solution.duplicate(a, 10, b);
    for(int i=0; i<10; i++){
        cout<<b[i]<<endl;
    }

}


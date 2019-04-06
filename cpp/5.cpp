//
// Created by sHuXnHs on 2019/4/6.
// 二维数组中的查找
//
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool Find(int target, vector<vector<int> > array) {

        if (array.empty()) {
            return false;
        }else {
            int row = array.size();      //行
            int col = array[0].size();   //列

            //从左下角开始查找，target比当前位置大的上移，小的右移
            //左下角的位置
            int x = 0;
            int y = row-1;

            while ((y >= 0) && (x < col)) {
                //target比较小，往上移
                if (array[y][x] > target) {
                    y-- ;
                } else if (array[y][x] < target) {
                    x++ ;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
};

int main(){

}

//
// Created by sHuXnHs on 2019/4/6.
//
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> multiply(const vector<int>& A) {
        vector<int> vectorB;

        for(int i=0; i<A.size(); i++){
            int temp = 1;

            for(int j =0 ; j<A.size(); j++){
                if(j != i){
                    temp *= A[j];
                }

            }

            vectorB.push_back(temp);
        }

        return vectorB;

    }
};


int main(){
    Solution solution;
    vector<int> vectorA, vectorB;
    vectorA.push_back(3);
    vectorA.push_back(5);
    vectorA.push_back(7);
    vectorB = solution.multiply(vectorA);
    for (int i : vectorB) {
        cout<< i <<endl;
    }

}
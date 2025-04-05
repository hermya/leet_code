#include<vector>
using namespace std;

class Solution {
    public:
        vector<int> grayCode(int n) {
            vector<int> sequence = vector<int>();
            for (int i = 0; i < (1 << n); i++) {
                sequence.push_back(i ^ (i >> 1));
            }
            return sequence;
        }
};
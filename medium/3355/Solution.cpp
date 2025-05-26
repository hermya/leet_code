#include <vector>

using namespace std;

class Solution {
public:
    bool isZeroArray(vector<int>& nums, vector<vector<int>>& queries) {
        int qSeg[nums.size() + 1];

        for (int i = 0; i < nums.size() + 1; i++) {
            qSeg[i] = 0;
        }

        for (int i = 0; i < queries.size(); i++) {
            qSeg[queries[i][0]]++;
            qSeg[queries[i][1] + 1]--;
        }   

        // for (int x : qSeg) {
        //     cout << x << " ";
        // }

        // cout<<endl;

        int calc = 0;

        for (int i = 0; i < nums.size(); i++) {
            calc += qSeg[i];
            if (calc < nums[i]) {
                return false;
            }
        }
        return true;
    }
};
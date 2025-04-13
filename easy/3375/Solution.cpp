#include<vector>
#include<unordered_set>

using namespace std;

class Solution {
    public:
        int minOperations(vector<int>& nums, int k) {
            unordered_set<int> container;
    
            for (const int& num: nums) {
                if (num < k) {
                    return -1;
                }
                if (num > k) {
                    container.insert(num);
                }
            }
    
            return container.size();
        }
    };
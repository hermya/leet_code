#include<vector>

using namespace std;

class Solution {
    public:
        long long countSubarrays(vector<int>& nums, long long k) {
            int start = 0;
            int end = 0;
            long long sCount = 0;
            long long currSum = 0;
    
            while (end < nums.size()) {
                currSum += nums[end];
                end++;
                if (currSum * (end - start) < k) {
                    sCount += end - start;
                } else {
                    while (start < end && currSum * (end - start) >= k) {
                        start++;
                        currSum -= nums[start - 1];
                    }
                    sCount += end - start;
                }
            }
            return sCount;
        }
    };
#include <unordered_map>

using namespace std;

class Solution {
    public:
        long long countGood(vector<int>& nums, int k) {
            unordered_map<int, int> pairKeeper = {};
            long long bsArrayCount = 0;
            int l = 0;
            int r = 0;
            int pairs = 0;
            pairKeeper[nums[l]] = 1;
    
            while (r < nums.size() - 1) { 
                r++;       
                if (pairKeeper.count(nums[r]) == 0) {
                    pairKeeper[nums[r]] = 1;
                } else {
                    int h = pairKeeper[nums[r]];
                    pairKeeper[nums[r]] = h + 1;
                    pairs += h;
                }
                if (pairs < k) {
                    bsArrayCount += r - l;
                } else {
                    while (l < r && pairs >= k) {
                        int h = pairKeeper[nums[l]];
                        pairKeeper[nums[l]] = h - 1;
                        pairs -= (h - 1);
                        l++;
                    }
                    bsArrayCount += r - l;
                }
            }
            return (nums.size() * (nums.size() - 1)) / 2 - bsArrayCount;
        }
    };
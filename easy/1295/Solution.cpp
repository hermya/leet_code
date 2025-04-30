#include <vector>

using namespace std;

class Solution {
    public:
        int findNumbers(vector<int>& nums) {
            int answer = 0;
    
            for (const int& num: nums) {
                if (hasEvenDigits(num)) {
                    ++answer;
                }
            }
    
            return answer;
        }
    
        int hasEvenDigits(int num) {
            int dc = 0;
            while (num > 0) {
                dc++;
                num /= 10;
            }
            return dc % 2 == 0;
        }
    };
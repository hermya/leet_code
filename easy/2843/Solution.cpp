#include <string>
using namespace std;

class Solution {
    public:
        int countSymmetricIntegers(int low, int high) {
            int count = 0;
            while (low <= high) {
                count += isSymmetric(low) ? 1 : 0;
                low++;
            }
            return count;
        }
    
        bool isBaseOdd(int candidate) {
            int baseSize = 0;
    
            while (candidate >= 10) {
                candidate /= 10;
                baseSize++;
            }
            return baseSize % 2 == 1;
        }
    
        bool isSymmetric(int candidate) {
            if (isBaseOdd(candidate)) {
                string temp = to_string(candidate);
                int rsum = 0;
                int lsum = 0;
                for (int i = 0; i < temp.length()/2; i++) {
                    int start = i;
                    int end = temp.length() - i - 1;
                    lsum += temp[start] - '0';
                    rsum += temp[end] - '0';
                }
    
                return lsum == rsum;
            } 
            return false;
        }    
};
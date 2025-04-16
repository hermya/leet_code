#include <cstdlib>
#include <vector>

using namespace std;

class Solution {
    public:
        int countGoodTriplets(vector<int>& arr, int a, int b, int c) {
            int ans = 0;
    
            for (int i = 0; i < arr.size() - 2; i++) {
                for (int j = i + 1; j < arr.size() - 1; j++) {
                    for (int k = j + 1; k < arr.size(); k++) {
                        int ai = arr[i];
                        int aj = arr[j];
                        int ak = arr[k];
    
                        if (abs(ai - aj) > a) {
                            continue;
                        } else if (abs(aj - ak) > b) {
                            continue;
                        } else if (abs(ai- ak) > c) {
                            continue;
                        } else {
                            ans++;
                        }
                    }
                }
            }
            return ans;
        }
    };
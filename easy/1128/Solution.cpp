#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int numEquivDominoPairs(vector<vector<int>>& dominoes) {
        for (vector<int>& vec: dominoes) {
            sort(vec.begin(), vec.end());
        }

        sort(dominoes.begin(), dominoes.end(), [](const vector<int>& a, const vector<int>& b){
            if (a[0] == b[0]) {
                return a[1] < b[1];
            }
            return a[0] < b[0];
        });

        int answer = 0;
        int i = 0;
        while (i < dominoes.size() - 1) {
            int j = i + 1;
            while (j < dominoes.size() && dominoes[i][0] == dominoes[j][0] && dominoes[i][1] == dominoes[j][1]) {
                answer += j - i;
                ++j;
            }
            i = j;
        }
        return answer;
    }
};
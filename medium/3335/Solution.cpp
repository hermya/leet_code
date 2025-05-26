#include <string>

using namespace std;

class Solution {
public:
    int lengthAfterTransformations(string s, int t) {
        int chart[26];

        for (int i = 0; i < 26; i++) {
            chart[i] = 0;
        }

        for (char c : s) {
            chart[c - 'a']++;
        }

        while (t > 0) {
            t--;

            int newChart[26];
            for (int i = 0; i < 26; i++) {
                newChart[i] = 0;
            }

            for (int i = 0; i < 26; i++) {
                if (chart[i] > 0) {
                    if (i == 25) {
                        newChart[0] = (newChart[0] + chart[i]) % 1000000007;
                        newChart[1] = (newChart[1] + chart[i]) % 1000000007;
                        chart[i] = 0;
                    } else {
                        newChart[i + 1] = (newChart[i + 1] + chart[i]) % 1000000007;
                        chart[i] = 0;
                    }
                }
            }

            for (int i = 0; i < 26; i++) {
                chart[i] = newChart[i];
            }

        }

        int answer = 0;

        for (int i = 0; i < 26; i++) {
            answer = (answer + chart[i]) % 1000000007;
        }

        return answer;
    }
};
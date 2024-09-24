#include <string>
#include <vector>

using namespace std;

int solution(int i, int j, int k) {
    int answer = 0;

    for (int s = i; s <= j; s++) {
        int num = s;
        while (num > 0) {
            if (num % 10 == k) answer++;
            num /= 10;
        }
    }

    return answer;
}

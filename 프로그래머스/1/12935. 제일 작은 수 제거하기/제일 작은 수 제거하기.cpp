#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr) {
    if (arr.size() <= 1) return {-1};

    vector<int> answer = arr;

    int compareNum = arr[0];
    int index = 0;
    for (int i = 1; i < arr.size(); i++) {
        if (arr[i] < compareNum) {
            compareNum = arr[i]; 
            index = i;           
        }
    }

    answer.erase(answer.begin() + index);

    return answer;
}

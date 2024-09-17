#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> stk;
    int idx = 0;
    if (stk.empty()) stk.push_back(arr[idx++]);
    while (idx != arr.size()) {
        if (stk.back() < arr[idx]) stk.push_back(arr[idx++]);
        else stk.pop_back();
    }
    return stk;
}
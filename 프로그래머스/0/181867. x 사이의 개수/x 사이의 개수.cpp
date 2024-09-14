#include <string>
#include <vector>

using namespace std;

vector<int> solution(string myString) {
    vector<int> answer;

    int l = 0;
    for(const auto v : myString)
    {
        if(v == 'x')
        {
            answer.emplace_back(l);
            l = 0;
        }
        else
        {
            l++;
        }
    }

    answer.emplace_back(l);

    return answer;
}
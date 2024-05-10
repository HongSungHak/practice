#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{   
    int count = 0;
    for (int i = 0; i < s.size(); i++) {
        if (s[i] == 'P' || s[i] == 'p') count++;
        if (s[i] == 'Y' || s[i] == 'y') count--;
    }
    return count ? false : true;
}
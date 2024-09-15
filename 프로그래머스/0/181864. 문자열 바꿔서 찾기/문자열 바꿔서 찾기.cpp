#include <string>
#include <vector>

using namespace std;

int solution(string myString, string pat) {
    for (int i = 0; i < myString.size(); i++) {
        switch (myString[i]) {
            case 'A' : myString[i] = 'B'; break;
            case 'B' : myString[i] = 'A'; break;
        }
    }
    return myString.find(pat)!=string::npos;
}
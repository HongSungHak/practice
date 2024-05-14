#include <iostream>
using namespace std;

int main() {
    int num;
    string word;
    cin >> num;
    for (int i = 0; i < num; i++) {
        cin >> word;
        cout << word[0] << word[word.length() - 1] << '\n';
    }

}
#include<iostream>
using namespace std;
int N;
int main(){
    int A, B;
    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> A >> B;
        cout << A + B << endl;
    }
    return 0;
}
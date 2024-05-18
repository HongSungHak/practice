#include <iostream>
using namespace std;

int rerecursiveSum(int n) {
    if (n < 0) return -1;
    if (n <= 1) return 1;
    return n + rerecursiveSum(n - 1);
}
int main() {
    int num;
    cin >> num;
    cout << rerecursiveSum(num);
}
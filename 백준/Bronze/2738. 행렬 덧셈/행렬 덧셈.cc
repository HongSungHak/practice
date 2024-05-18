#include <iostream>

using namespace std;

int main()
{
    int col, row;
    cin >> col >> row;
    long long arr1[col][row];
    long long arr2[col][row];
    
    for (int i = 0; i < col; i++) {
        for (int j = 0; j < row; j++) {
            cin >> arr1[i][j];
        }
    }
    
    for (int i = 0; i < col; i++) {
        for (int j = 0; j < row; j++) {
            cin >> arr2[i][j];
        }
    }
    
    for (int i = 0; i < col; i++) {
        for (int j = 0; j < row; j++) {
            cout << arr1[i][j] + arr2[i][j];
            if (j != row - 1) {
                cout << ' ';
            }
        }
        cout << '\n';
    }

    return 0;
}

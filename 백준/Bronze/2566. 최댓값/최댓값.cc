#include <iostream>
using namespace std;
const int COL = 9;
const int ROW = 9;
int arr[COL][ROW];
int main()
{
    int max = 0;
    int col, row;
    for (int i = 0; i < COL; i++)
    {
        for (int j = 0; j < ROW; j++)
        {
            cin >> arr[i][j];
        }
    }
    for (int i = 0; i < COL; i++)
    {
        for (int j = 0; j < ROW; j++)
        {
            if (arr[i][j] > max) {
                max = arr[i][j];
                col = i + 1;
                row = j + 1;
            } else if(max == 0)
            {
                col = 1;
                row = 1;
            }
        }
    }
    cout << max << '\n';
    cout << col << " " << row;
}
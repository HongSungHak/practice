#include <iostream>
using namespace std;

int main()
{
    int buyPrice;
    int totalPrice = 0;
    int productAmount;
    cin >> buyPrice >> productAmount;

    for (int i = 0; i < productAmount; i++)
    {
        int price, count;
        cin >> price >> count;
        totalPrice += price * count;
    }
    if (totalPrice == buyPrice) cout << "Yes";
    else cout << "No";
}
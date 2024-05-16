#include <iostream>
#include <algorithm>
using namespace std;
 
int main(int argc, const char *argv[]) {
	int a, b;
	while (true)
	{
		cin >> a >> b;
		if (a == 0 && b == 0) break;
		cout << a + b << '\n';
	}
}
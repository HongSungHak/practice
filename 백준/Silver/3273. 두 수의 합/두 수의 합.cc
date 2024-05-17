#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
 
int main(int argc, const char *argv[]) {
	int count = 0;
	int inputNum;
	cin >> inputNum;
	vector<int> vec;
	int a;
	int targetNum; 
	for (int i = 0; i < inputNum; i++)
	{
		cin >> a;
		vec.push_back(a);
	}
	cin >> targetNum;
	sort(vec.begin(), vec.end());
	int startIndex = 0;
	int endIndex = inputNum - 1;
	while (startIndex < endIndex)
	{
		if (vec[startIndex] + vec[endIndex] == targetNum)
		{
			count++;
			startIndex++;
			endIndex--;
		}
		if (vec[startIndex] + vec[endIndex] > targetNum)
		{
			endIndex--;
		}
		if (vec[startIndex] + vec[endIndex] < targetNum)
		{
			startIndex++;
		}
	}
	cout << count;
}
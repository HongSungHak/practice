#include <iostream>
using namespace std;

const int StudentNum = 31;
const int CommitStudents = 28;
int students[StudentNum];

int main() {
    int student;
	for (int i = 0; i < CommitStudents; i++) {
        cin >> student;
        students[student] = 1;
    }
    for (int i = 1; i < StudentNum; i++) {
        if (students[i] == 0) {
            cout << i << endl;
        }
    }
}
#include <iostream>
using namespace std;
void PrintRect(int n, int m) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cout << "1";
        }
        cout << endl;
    }
}
int main() {
    // Please write your code here.
    int num1;
    int num2;
    cin >> num1;
    cin >> num2;
    PrintRect(num1, num2);
    return 0;
}
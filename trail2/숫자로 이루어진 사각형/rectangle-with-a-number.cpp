#include <iostream>
using namespace std;

void PrintNum(int n) {
    int cnt = 1;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (cnt == 10) {
                cnt = 1;
            }
            cout << cnt;
            cout << " ";
            cnt++;
        }
        cout << endl;
    }
}

int main() {
    // Please write your code here.
    int num;
    cin >> num;

    PrintNum(num);

    return 0;
}
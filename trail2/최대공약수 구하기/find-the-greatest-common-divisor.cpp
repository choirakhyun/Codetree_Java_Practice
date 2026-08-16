#include <iostream>
using namespace std;

void PrintMax(int n, int m) {
    int cnt = n + m;
    int num;
    for (int i = 1; i < cnt; i++) {
        if (cnt % i == 0) {
            if (n % i == 0 && m % i == 0) {
                num = i;
            }
        }
    }
    cout << num << endl;
}

int main() {
    // Please write your code here.
    int n, m;
    cin >> n >> m;
    PrintMax(n , m);
    return 0;
}
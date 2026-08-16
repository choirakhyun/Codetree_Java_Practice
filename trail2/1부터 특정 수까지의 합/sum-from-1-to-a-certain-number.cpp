#include <iostream>
using namespace std;

void SumNum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    cout << sum / 10 << endl;
}

int main() {
    // Please write your code here.
    int n;
    cin >> n;
    SumNum(n);

    return 0;
}
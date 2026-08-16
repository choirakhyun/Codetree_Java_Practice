#include <iostream>
#include <algorithm>

using namespace std;

void FindGCD(int n, int m) {
    int num;
    for (int i = 1; i <= min(n, m); i++) {
        if (n % i == 0 && m % i == 0) {
            num = i;
        }
    }
    cout << num << endl;
}

int main() {
    // Please write your code here.
    int n, m;
    cin >> n >> m;
    FindGCD(n, m);
    return 0;
}
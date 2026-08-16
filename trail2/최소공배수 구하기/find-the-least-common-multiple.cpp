#include <iostream>
#include <algorithm>

using namespace std;

void FindLCM(int n, int m) {
    for (int i = max(n, m); ; i++) {
        if (i % n == 0 && i % m == 0) {
            cout << i << endl;
            break;
        }
    }
}
int main() {
    // Please write your code here.
    int n, m;
    cin >> n >> m;
    FindLCM(n, m);
    return 0;
}
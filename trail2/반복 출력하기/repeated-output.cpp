#include <iostream>
using namespace std;

void Print5Stars(int n) {
    for(int i = 0; i < n; i++) {
        cout << "12345^&*()_";
        cout << endl;
    }
}

int main() {
    // Please write your code here.
    int num;
    cin >> num;
    Print5Stars(num);
    return 0;
}
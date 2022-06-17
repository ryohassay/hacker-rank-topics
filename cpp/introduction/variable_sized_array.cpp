#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int n, q;
    cin >> n >> q;
    vector<int> arr[n];
    for (int i = 0; i < n; i++){
        int size;
        cin >> size;
        arr[i].reserve(size);
        for (int j = 0; j < size; j++){
            cin >> arr[i][j];
        }
    }

    for (int i = 0; i < q; i++){
        int idx1, idx2;
        cin >> idx1 >> idx2;
        cout << arr[idx1][idx2] << endl;
    }

    return 0;
}

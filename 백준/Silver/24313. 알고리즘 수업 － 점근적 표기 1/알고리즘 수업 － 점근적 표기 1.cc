#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    int a1, a0;
    cin >> a1 >> a0;
    int c;
    cin >> c;
    int n0;
    cin >> n0;
    
    if(a1 * n0 + a0 <= c * n0 && a1 <= c) cout << 1 <<endl;
    else cout << 0 << endl;

    return 0;
}
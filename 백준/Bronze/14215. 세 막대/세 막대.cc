#include<iostream>
#include<algorithm>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    
    int x[3];
    cin >> x[0] >> x[1] >> x[2];
    sort(x, x+3);
    if(x[0] + x[1] > x[2]) cout << x[0] + x[1] + x[2] << endl;
    else cout << (x[0] + x[1]) * 2 - 1 << endl;
       
    return 0; 
}
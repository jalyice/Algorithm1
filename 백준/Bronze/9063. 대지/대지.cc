#include<iostream>
#include<algorithm>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    int n;
    cin >> n;
    int x[n], y[n];
    int minx = 10000, maxx = -10000, miny = 10000, maxy = -10000;
    for(int i=0; i<n; i++){
        cin >>x[i] >>y[i];
        if(x[i]<minx) minx = x[i];
        if(x[i]>maxx) maxx = x[i];
        if(y[i]<miny) miny = y[i];
        if(y[i]>maxy) maxy = y[i];
    }
    cout << (maxx-minx) * (maxy-miny) << endl;
    return 0; 
}
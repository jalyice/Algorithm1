#include<iostream>
#include<algorithm>
using namespace std;
int diff[100000];
int arr[100000];
int GCD(int a, int b){
    int c;
    while(b!=0){
        c=a%b;
        a=b;
        b=c;
    }
    return a;
}
int main(){

    ios::sync_with_stdio(false);
	cin.tie(0);
    
    int n;
    int gcd;
    int cnt =0; 
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }
    for(int i=0; i<n-1; i++){
        diff[i] = arr[i+1]- arr[i];
    }
    gcd = diff[0];
    for(int i=0; i<n-1; i++){
        gcd = GCD(gcd, diff[i+1]);
    }
    for (int i = 0; i < n - 1; i++) {
		cnt += (diff[i] / gcd) - 1;	
	}
    cout << cnt << '\n';
    return 0; 
}
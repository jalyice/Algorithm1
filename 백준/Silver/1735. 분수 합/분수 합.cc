#include<iostream>
#include<algorithm>
using namespace std;
int gcd(int a, int b){
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
    
    int a, b, c, d;
    cin >> a >> b;
    cin >> c >> d;
    
    int e, f;
    e = a*d + c*b;
    f = b*d;
    int g = gcd(e,f);
    cout << e/g << " " << f/g << '\n';

    return 0; 
}
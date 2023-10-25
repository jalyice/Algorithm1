#include<iostream>
#include<set>
#include<algorithm>
using namespace std;
int gcd(int a, int b) // 최대공약수
{
	int c;
	while (b != 0)
	{
		c = a % b;
		a = b;
		b = c;
	}
	return a;
}
int lcm(int a, int b){ // 최소공배수
    return a*b / gcd(a,b);
}
int main(){

    ios::sync_with_stdio(false);
	cin.tie(0);
    int T;
    cin >> T;
    while(T-- > 0){
        int a, b;
        cin >> a >> b;
        cout << lcm(a, b) << endl;
    }

    return 0; 
}
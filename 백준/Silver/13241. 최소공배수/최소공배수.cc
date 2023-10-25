#include<iostream>
#include<set>
#include<algorithm>
using namespace std;
long long int gcd(long long int a, long long int b) // 최대공약수
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
long long int lcm(long long int a, long long int b){ // 최소공배수
    return a*b / gcd(a,b);
}
int main(){

    ios::sync_with_stdio(false);
	cin.tie(0);
    
    long long int a, b;
    cin >> a >> b;
    cout << lcm(a, b) << '\n';
    

    return 0; 
}
#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    string N;
    cin >> N;
    sort(N.begin(), N.end(), greater<char>());
    cout << N << endl;
    return 0;
}
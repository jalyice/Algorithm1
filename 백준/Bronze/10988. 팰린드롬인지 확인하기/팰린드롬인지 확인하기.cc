#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    string s;
    cin >> s;
    string res;
    res = s;
    reverse(s.begin(), s.end());
    if(s==res) cout<< 1 << endl; 
    else cout << 0 << endl;
    
}
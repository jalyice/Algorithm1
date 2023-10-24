#include<iostream>
#include<set>
#include<algorithm>
using namespace std;

int main(){

    ios::sync_with_stdio(false);
	cin.tie(0);
    string s;
    cin >> s;

    set<string> a; // 중복허용 x
    for(int i = 0; i < s.size(); i++){
        for(int j = 1; j + i <= s.size(); j++){
            a.insert(s.substr(i, j));
        }
    }
    cout << a.size() << endl;   

    return 0; 
}
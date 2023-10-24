#include<iostream>
#include<map>
#include<algorithm>
using namespace std;

int main(){
    map<string, int> mp;
    map<string, int>::iterator it; 
    int n, m;
    string str1[100001];
    string str2;
    int num;
    ios::sync_with_stdio(false);
	cin.tie(0);
    cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> str1[i];
        mp.insert(make_pair(str1[i], i));
    }
    for(int i=0; i<m; i++){
        cin >> str2;
        if(isdigit(str2[0])!=0){ // 숫자인 경우
            num=stoi(str2)-1;
            cout << str1[num] << "\n";
        }
        else{
            it = mp.find(str2);
            cout << it->second+1<<"\n";
        }
    }
    
    
    return 0; 
}
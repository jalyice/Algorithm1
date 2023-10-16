#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    int n, cnt=0; 
    cin >> n ;
    for(int i=0; i<n; i++){
        string s;
        cin >> s; 
        bool flag = true;
        for(int j=0; j<s.size(); j++){
            for(int k=0; k<j; k++){
                if(s[j] != s[j-1] && s[j] == s[k]){ // 바로 앞의 문자가 같지 않은데 이전에 같은 문자가 나온경우 그룹 단어가 아니다.
                    flag = false;
                    break;
                }
            }
        } 
        if(flag) cnt++;
    }
    cout << cnt <<endl; 
}
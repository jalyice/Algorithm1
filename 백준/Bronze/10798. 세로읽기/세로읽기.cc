#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    string arr[15][15];
    
    for(int i=0; i<5; i++){
        string s;        
        cin >> s;
        for(int j=0; j<s.length(); j++){
            arr[i][j] = s[j]; 
        }
    }
    for(int i=0; i<15; i++){
        for(int j=0; j<15; j++){
            cout<<arr[j][i];
        }
    }
    cout << endl;
}
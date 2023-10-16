#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    string s;
    int num, n;
    cin >> num >> n; 
    for(int i=num; i>0; i/=n){
        int tmp = i%n;
        if(tmp>9){
            tmp  = tmp - 10 + 'A';
            s+= tmp;
        }
        else{
            s+= '0' + tmp;
        }
    }
    reverse(s.begin(), s.end());
    
    cout << s << endl;
}
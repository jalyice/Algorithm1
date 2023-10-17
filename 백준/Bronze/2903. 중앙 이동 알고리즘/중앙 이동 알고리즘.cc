#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    int N;
    cin >> N;
    int dot = 2;
    while(N--){
        dot = dot+(dot-1);
    }
    cout << dot * dot << endl;

    
    return 0;
}
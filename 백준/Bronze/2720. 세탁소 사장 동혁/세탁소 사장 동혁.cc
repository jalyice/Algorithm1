#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    int T;
    cin>> T;
    int Quarter=25, Dime=10, Nickel=5, Penny=1; // 단위 센트
    while(T-- > 0){
        int C; // 단위 센트
        cin >> C; 
        int remain;
        
        cout << C/Quarter << " ";
        remain=C%Quarter;
        cout << remain/Dime << " ";
        remain=remain%Dime;
        cout << remain/Nickel << " ";
        remain = remain%Nickel;
        cout << remain/Penny << endl;
        
    }
    return 0;
}
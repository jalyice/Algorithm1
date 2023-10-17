#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    //첫 번째 숫자가 두 번째 숫자의 약수이다. -> factor 
    //첫 번째 숫자가 두 번째 숫자의 배수이다. -> multiple
    //첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다. -> neither
    
    while(true){
        int num1, num2;
        cin >> num1 >> num2;
        if(num1 == 0 && num2 == 0) break;
        if( num2 % num1  == 0 ) cout << "factor" << endl;
        else if( num1 % num2 == 0 ) cout << "multiple" << endl;
        else if(num2 % num1 != 0 && num1 % num2 != 0 ) cout << "neither" << endl;
    }
    
    
    return 0;
}
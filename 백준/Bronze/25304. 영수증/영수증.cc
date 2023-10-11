#include <iostream>
using namespace std;

int main()
{
    int X, N, a, b; // 총 금액 , 물건의 종류의 수 , 가격 , 개수
    int sum = 0; 
    cin >> X >> N;
    for(int i=0; i<N; i++){
        cin >> a >> b;
        sum+=a*b; 
    }
    if(sum== X) cout << "Yes" <<endl;
    else cout << "No"<<endl;
   
    
    return 0;
}
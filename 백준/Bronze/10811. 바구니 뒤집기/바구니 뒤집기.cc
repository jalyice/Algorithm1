#include<iostream>
#include<algorithm>
using namespace std;

int main(){

    int N, M;
    
    cin >> N >> M;
    int arr[N+1];
    for(int i=1; i<=N; i++){
        arr[i]=i;
    }
    for(int a=1; a<=M; a++){
        int i, j;
        cin >> i >> j;
        reverse(arr+i, arr+j+1);
        
    }
    for(int a=1; a<=N; a++){
        cout << arr[a]<<" ";
    }
    cout << endl;

    return 0;
}
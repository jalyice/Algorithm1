#include<iostream>
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
        int tmp;
        cin >> i >> j;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    for(int a=1; a<=N; a++){
        cout << arr[a]<<" ";
    }
    cout << endl;

    return 0;
}
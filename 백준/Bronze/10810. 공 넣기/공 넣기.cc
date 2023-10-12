#include<iostream>
using namespace std;

int main(){

    int N, M;
    
    cin >> N >> M;
    int arr[N];
    for(int a=1; a<=N; a++){
        arr[a]=0;
    } 
    for(int a=1; a<=M; a++){
        int i, j, k;
        cin>> i >> j >> k;
        for(int b=i; b<=j; b++){
            arr[b]=k;
        }
    }
    for(int a=1; a<=N; a++){
        cout << arr[a] << " ";
    }
    cout<<endl;

    return 0;
}
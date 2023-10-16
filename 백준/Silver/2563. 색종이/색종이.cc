#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    int arr[101][101]={0};
    int n, x, y, cnt=0;
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> x >> y;
        for(int j=y; j<y+10; j++){
            for(int k=x; k<x+10; k++){
                if(!arr[j][k]){
                    cnt++;
                    arr[j][k]=1;
                }
            }
        }
    }
    
    cout << cnt << endl;
}
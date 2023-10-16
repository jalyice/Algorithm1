#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    int arr[9][9];
    int max =0;
    int x=1, y=1;
    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
            cin >> arr[i][j];
            if(arr[i][j] > max) {
                max = arr[i][j];
                x=i+1;
                y=j+1;
            }
        }
    }
    cout << max <<endl;
    cout << x << " "<< y <<endl;
}
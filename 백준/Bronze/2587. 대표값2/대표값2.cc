#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    int arr[5];
    int sum = 0;
    for(int i=0; i<5; i++){
        cin >> arr[i];
        sum+= arr[i];
    }
    cout << sum/5 << endl;
    sort(arr, arr+5);
    for(int i=0; i<5; i++){
        if(i==2) cout << arr[i] << endl;
    }
    return 0;
}
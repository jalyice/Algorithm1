#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    int N, k;
    cin >> N >> k;
    int arr[N];

    for(int i=0; i<N; i++){
        cin >> arr[i];   
    }
    sort(arr, arr+N);
    cout << arr[N-k]<<endl;
    return 0;
}
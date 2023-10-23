#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    int arr1[500001];
    int arr2[500001];
    int n, m;
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> arr1[i];
    }
    cin >> m;
    for(int i=0; i<m; i++){
        cin >> arr2[i];
    }
    sort(arr1, arr1+n);
    for(int i=0; i<m; i++){
       cout << binary_search(arr1, arr1+n, arr2[i]) << " ";
    }
    cout << endl;
    
    return 0; 
}
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    string arr1[10001];
    string arr2[10001];
    int n, m, cnt=0;
    cin >> n >> m;;
    for(int i=0; i<n; i++){
        cin >> arr1[i];
    }
    for(int i=0; i<m; i++){
        cin >> arr2[i];
    }
    sort(arr1, arr1+n);
    for(int i=0; i<m; i++){
       if(binary_search(arr1, arr1+n, arr2[i])!=0) cnt++;
    }
    cout << cnt << endl;
    
    return 0; 
}
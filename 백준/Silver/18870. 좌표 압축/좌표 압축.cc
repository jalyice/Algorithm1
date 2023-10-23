#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    int n;
    vector<int> v;
    vector<int> sort_v;
    
    cin >> n;
    v.resize(n);
    for(int i=0; i<n; i++){
        cin >> v[i];
    }
    sort_v=v;
    sort(sort_v.begin(), sort_v.end());
    sort_v.erase(unique(sort_v.begin(),sort_v.end()),sort_v.end());

    for(int i=0; i<n; i++){
        cout << lower_bound(sort_v.begin(), sort_v.end(), v[i])-sort_v.begin()<< " ";
    }
    cout << "\n";

    return 0; 
}
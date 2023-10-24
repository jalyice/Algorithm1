#include<iostream>
#include<map>
#include<algorithm>
using namespace std;

int main(){
    map<int, bool> mp;
    int a, b;
    int num;
    ios::sync_with_stdio(false);
	cin.tie(0);
    cin >> a >> b;

    for(int i=0; i<a+b; i++){
        cin >> num;
        if(mp[num]==true){
            mp.erase(num);
        }
        else{
            mp[num]=true;
        }
    }
    /*for(auto itr = mp.begin(); itr!=mp.end(); itr++){
        cout <<itr->first << " " << itr->second << endl;
    }*/
    cout << mp.size() << endl;


    return 0; 
}
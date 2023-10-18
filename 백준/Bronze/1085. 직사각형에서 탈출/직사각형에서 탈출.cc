#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    vector<int> vec;
    int x, y, w, h;
    cin >> x >> y >> w >> h;
    int min = 1000;
    vec.push_back(x);
    vec.push_back(y);
    vec.push_back(w-x);
    vec.push_back(h-y);
    sort(vec.begin(), vec.end());
    cout << vec[0] << endl;


    return 0; 
}
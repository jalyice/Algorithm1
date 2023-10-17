#include<iostream>
#include<algorithm>
#include<vector>
#include<math.h>

using namespace std;

int main(){
    int N, K; // N의 약수중 K번째로 작은 수

    vector<int> vec;
    cin >> N >> K;
    for(int i=1; i<=sqrt(N); i++){
        if(N%i==0){
            vec.push_back(i);
            if(i != N/i ) vec.push_back(N/i);
        }
    
    }
    sort(vec.begin(), vec.end());
    if(vec.size() < K) cout<< 0 <<endl;
    else cout << vec[K-1] << endl;

    return 0;
}
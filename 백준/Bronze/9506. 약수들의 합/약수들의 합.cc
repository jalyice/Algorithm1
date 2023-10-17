#include<iostream>
#include<algorithm>
#include<vector>
#include<math.h>

using namespace std;

int main(){

    while(true){
        int N;
        cin >>N; 
        if(N == -1) break;
        vector<int> vec;
        for(int i=1; i<=sqrt(N); i++){
            if(N%i ==0){
                vec.push_back(i);
                if(i != N/i) vec.push_back(N/i);
            }
        }
        sort(vec.begin(), vec.end());
        int sum =0;
        for(int i=0; i<vec.size()-1; i++){
            sum+=vec[i];
        }
        if(sum == N){
            cout << N << " = ";
            for(auto a = vec.begin(); a!=vec.end()-1; a++){
                if(a== vec.begin()) cout<< *a;
                else cout<< " + "<< *a;
            }
            cout<<endl;
        }
        else {
            cout<< N << " is NOT perfect."<<endl;
        }
    }

    

    return 0;
}
#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){
    string s;
    vector<string> croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
    cin >> s;
    
    for(int i=0; i<croatia.size(); i++){
        while(1){
            int idx = s.find(croatia[i]);
            if(idx == string::npos) break;
            s.replace(idx, croatia[i].length(),"#");
        }
            
    }
    cout<< s.length() <<endl;
    
    
}
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int main(){

    int sum = 0;
    string s;
    vector<string> vec = {{"-1"},{"-1"},{"-1"},{"ABC"},{"DEF"},{"GHI"},{"JKL"},{"MNO"},{"PQRS"},{"TUV"},{"WXYZ"}};
    cin>>s;
    for(int i = 0; i < s.length(); i++)
        for(int j =0; j < vec.size(); j++)
            if(vec[j].find(s[i]) != string::npos)
                sum += j;
    cout<<sum;
}
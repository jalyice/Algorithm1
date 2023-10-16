#include<iostream>
#include<string>
#include<algorithm>
#include<map>
using namespace std;

int main(){
    map<string, float> map = { {"A+", 4.5}, {"A0", 4.0}, {"B+",3.5}, {"B0", 3.0}, {"C+", 2.5}, {"C0",2.0}, {"D+", 1.5}, {"D0",1.0}, {"F",0}};
    float sum=0, totalgrade=0, avg;
    for(int i=0; i<20; i++){
        string subject, grade;
        float score; 
        cin >> subject >> score >> grade;
        if(grade != "P"){
            sum += score;
            totalgrade += score * map[grade];
        }        
    }
    avg = totalgrade/sum;
    cout<<fixed;
    cout.precision(6);
    cout << avg <<endl;
}
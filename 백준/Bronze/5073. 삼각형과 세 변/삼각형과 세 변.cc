#include<iostream>
#include<algorithm>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    // Equilateral :  세 변의 길이가 모두 같은 경우
    // Isosceles : 두 변의 길이만 같은 경우
    // Scalene : 세 변의 길이가 모두 다른 경우
    // Invalid : 세 변의 길이가 삼각형을 만족하지 못하는 경우
    while(true){
        int x, y, z; 
        cin >> x >> y >> z;
        if( x == 0 && y == 0 && z == 0) break; 
        if(x+y<=z || y+z <=x || z+x <=y) {
            cout << "Invalid" << endl;
            continue;
        }
        if(x==y && y==z) cout << "Equilateral" << endl;
        else if(x==y || y==z || z==x) cout << "Isosceles"<< endl;
        else if(x!=y && y!=z && z!=x) cout << "Scalene" << endl;
    }
    
    
 
    return 0; 
}
#include<iostream>
#include<algorithm>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
	cin.tie(0);
    // 세 각의 크기가 모두 60이면, Equilateral
    // 세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
    // 세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
    // 세 각의 합이 180이 아닌 경우에는 Error
    int x, y, z; 
    cin >> x >> y >> z;
    if( (x + y + z) != 180 ){
        cout << "Error" << endl;
    }
    else {
        if(x == 60 && y == 60 && z == 60) cout << "Equilateral" << endl;
        else if(x==y || y==z || x==z){
            cout << "Isosceles" << endl;
        }
    
        else if( x!=y && y!=z && x!=z){
            cout << "Scalene" << endl;
        }  
    }
    
 
    return 0; 
}
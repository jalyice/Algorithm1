#include <iostream>
using namespace std;

int main()
{
    int x, y, z;
    cin >> x >> y >> z;
    if( x == y && y == z ) cout << 10000 + x*1000 ; 
    else if ( x == y && y!=z && x!=z )cout << 1000 + x*100;
    else if(y == z && x!=y && x!= z) cout << 1000 + y*100;
    else if(x==z && x!=y && y!=z) cout<< 1000 + z*100;
    else {
        if(x > y && x > z) cout << x*100;
        else if( y > x && y > z ) cout << y*100;
        else cout << z*100;
    }

    
    return 0;
}
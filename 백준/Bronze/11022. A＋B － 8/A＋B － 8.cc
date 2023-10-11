#include <iostream>
#include <string>
using namespace std;

int main()
{
    int T, x, y;

    cin >> T;
    for(int i=0; i<T; i++){
        cin >> x >> y;
        cout << "Case #" << i+1 << ": " << x<< " + " <<y <<" = " << x+y << endl;
    }
    
    return 0;
}
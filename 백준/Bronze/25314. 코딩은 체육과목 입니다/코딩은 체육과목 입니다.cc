#include <iostream>
#include <string>
using namespace std;

int main()
{
    int N;
    cin >> N;
    string s = ""; 
    for(int i=4; i<=N; i+=4){
        s+="long ";
    }
    cout << s << "int" <<endl;
    

    
    return 0;
}
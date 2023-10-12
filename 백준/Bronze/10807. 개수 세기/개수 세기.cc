#include <iostream>
using namespace std;

int main()
{
    int N, v, cnt=0;
    cin >> N;
    int arr[N];
    for(int i=0; i<N; i++){
        cin >> arr[i];
    }
    cin >> v;
    for(int i=0; i<N; i++){
        if(arr[i]==v) cnt++;
    }
    cout << cnt << endl;

    return 0;
}
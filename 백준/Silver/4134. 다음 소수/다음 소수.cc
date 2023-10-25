#include<iostream>
#include<vector>
#include<cmath>
#include<algorithm>
using namespace std;
int main(){

    ios::sync_with_stdio(false);
	cin.tie(0);
    int T;
    cin >> T;
    while(T-- > 0){
        long long int N;
        cin >> N;
        if(N==0 || N == 1 || N==2){
            cout << 2 << '\n';
            continue;
        }
		while(true)
		{
			int result = 0;
			for (long long j = 2; j <= sqrt((double)N) + 1; j++)
			{
				if (N % j == 0){
					result++;
					break;
				}
			}
			if (result == 0){
				cout << N << '\n';
				break;
			}
			N++;
		}
    }
    return 0; 
}
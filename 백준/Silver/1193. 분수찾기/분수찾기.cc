#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    int N;
    cin >> N;
    int cross_count =1, prev_count_sum =0;
    while(true){
        
        if(N <= prev_count_sum + cross_count){ // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별 
            if(cross_count % 2 == 1){ // 대각선의 개수가 홀수라면
                // 분자가 큰 수 부터 시작
                // 분자는 대각선상 내의 블럭 개수 - (N번째 - 직전 대각선까지의 블럭 개수 - 1) 
				// 분모는 N번째 - 직전 대각선까지의 블럭 개수
                cout<< cross_count - (N - prev_count_sum -1 ) << "/" << N - prev_count_sum << endl;
                break;
            }
            else{   // 대각선상의 블럭의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
                cout<< N - prev_count_sum << "/" << cross_count - (N - prev_count_sum -1 ) << endl;
                break;
            }
        }
        else{
            prev_count_sum += cross_count;
            cross_count++;
        }
       
    }

    return 0;
}
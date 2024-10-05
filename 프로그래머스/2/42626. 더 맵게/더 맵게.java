import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int s : scoville) {
            pq.offer(s);
        }
        int mixCount = 0; 
        
        // 가장 낮은 두 개의 스코빌 지수를 섞어 K 이상이 될 때까지 반복
        while (pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll(); // 가장 낮은 스코빌 지수
            int second = pq.poll(); // 두 번째로 낮은 스코빌 지수
            
            // 섞은 음식의 스코빌 지수 계산
            int newScoville = first + (second * 2);
            pq.offer(newScoville);
            
            mixCount++; // 섞은 횟수 증가
        }
        
        // 모든 음식의 스코빌 지수가 K 이상인지 확인
        return pq.peek() >= K ? mixCount : -1;
    }
}

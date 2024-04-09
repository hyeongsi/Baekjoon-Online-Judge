import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int scov : scoville) {
            pq.add(scov);
        }
          
        int answer = 0;
        while (pq.size() > 1 && pq.peek() < K) {
            int weakHot = pq.poll();
            int secondWeakHot = pq.poll();
            
            int mixHot = weakHot + (secondWeakHot * 2);
            pq.add(mixHot);
            answer++;
        }
        
        if (pq.size() <= 1 && pq.peek() < K) {
            answer = -1;
        }
        
        return answer;
    }
}
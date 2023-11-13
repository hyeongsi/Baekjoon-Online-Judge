import java.util.*;

class Solution {
    public int solution(int n) { 
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        while(n != 0){
            int value = n % 3;
            queue.offer(value);
            n /= 3;
        }  
        
        while(!queue.isEmpty()){
            int pop = queue.poll();
            System.out.println(pop);
            answer *= 3;
            answer += pop;
        }
        
        return answer;
    }
    
}
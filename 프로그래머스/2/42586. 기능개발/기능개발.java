import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            final double remain = (100 - progresses[i]) / (double) speeds[i];
            final int completeDay = (int) Math.ceil(remain);
            
            if (!queue.isEmpty() && queue.peek() < completeDay) {
                answerList.add(queue.size());
                queue.clear();
            }
            
            queue.add(completeDay);
        }  
        
        answerList.add(queue.size());
        
        int[] answer = new int[answerList.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}
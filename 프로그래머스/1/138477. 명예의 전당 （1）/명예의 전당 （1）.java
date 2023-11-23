import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> honors = new LinkedList<>();
        
        for(int i = 0; i < score.length; i++){
            honors.add(score[i]);
            Collections.sort(honors, Collections.reverseOrder());
            answer[i] = honors.size() >= k ? honors.get(k-1) : honors.get(honors.size()-1);
        }
        
        return answer;
    }
}
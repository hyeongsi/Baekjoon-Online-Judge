import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] supoScore = new int[3];
        int[][] supoPattern = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        
        for(int i = 0; i < answers.length; i++) {
            int ans = answers[i];
            if(ans == supoPattern[0][i % (supoPattern[0].length)]){
                supoScore[0]++;
            }
            
            if(ans == supoPattern[1][i % (supoPattern[1].length)]){
                supoScore[1]++;
            }
            
            if(ans == supoPattern[2][i % (supoPattern[2].length)]){
                supoScore[2]++;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        int max = Math.max(supoScore[0], Math.max(supoScore[1], supoScore[2]));
        for(int i = 0; i < supoScore.length; i++){
            if(max == supoScore[i]){
                list.add(i);
            }
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i) + 1;
        }
        
        return answer;
    }
}
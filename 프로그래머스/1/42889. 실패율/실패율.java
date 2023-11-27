import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] clear = new int[N + 1];

        for(int i = 0; i < stages.length; i++) {
            clear[stages[i] - 1]++;
        }

        int clearCnt = clear[N];
        List<Score> list = new ArrayList<>();
        for(int i = N - 1; i >= 0; i--){
            clearCnt += clear[i];
            if(clearCnt == 0){
                list.add(new Score(i + 1, 0.0));
            } else {
                list.add(new Score(i + 1, clear[i] / (clearCnt * 1.0)));
            }
        }
        
        int[] answer = new int[N];
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).index;
            System.out.println(list.get(i).index + ", " + list.get(i).failure);
        }
        
        return answer;
    }
    
    class Score implements Comparable<Score> {
        public int index;
        public double failure;
        
        public Score(int index, double failure) {
            this.index = index;
            this.failure = failure;
        }
        
        @Override
        public int compareTo(Score score){
            if(this.failure == score.failure){
                return this.index - score.index;
            }
            
            return (this.failure > score.failure) ? -1 : 1;
        }
    }
}
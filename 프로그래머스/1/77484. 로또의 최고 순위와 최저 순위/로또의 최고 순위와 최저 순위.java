import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        Map<Integer, Boolean> map = new HashMap<>();
        int zeroCnt = 0;
        
        for(int lotto : lottos) {
            if(lotto == 0){
                zeroCnt++;
                continue;
            }
            
            map.put(lotto, true);
        }
        
        int sameCnt = 0;
        for(int winNum : win_nums) {
            if(map.containsKey(winNum)) sameCnt++;
        }
        
        int maxRank = 7 - (sameCnt + zeroCnt);
        int minRank = 7 - sameCnt;
        
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        return new int[] {maxRank, minRank};
    }
}
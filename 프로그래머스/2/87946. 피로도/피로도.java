import java.util.*;

class Solution {
    public static boolean dp[];
    public static int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        dp = new boolean[dungeons.length];
        
        dfs(k, dungeons, 0);     
        
        return answer;
    }
    
    public static void dfs(int tired, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!dp[i] && dungeons[i][0] <= tired) {
                dp[i] = true;
                dfs(tired - dungeons[i][1], dungeons, cnt + 1);
                dp[i] = false;
            }
        }
        
        answer = Math.max(answer, cnt);
    }
}
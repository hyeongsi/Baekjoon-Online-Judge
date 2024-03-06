import java.util.*;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int visited = 0;
        int answer = dfs(k, dungeons, 0, visited);
        return answer;
    }
    
     private int dfs(int k, int[][] dungeons, int r, int visited) {
        int max = r;
        for (int i = 0; i < dungeons.length; i++) {
            int v = 1 << i;
            int [] dungeon = dungeons[i];
            if (dungeon[0] <= k && (visited & v) == 0) {
                max = Math.max(max, dfs(k - dungeon[1], dungeons, r + 1, visited | v));
            }
        }
        return max;
    }
}
import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        HashMap<String, Integer> dirMap = new HashMap<>();
        dirMap.put("U", 0);
        dirMap.put("L", 1);
        dirMap.put("D", 2);
        dirMap.put("R", 3);
        
        int[] dx = {0, -1, 0, 1};
        int[] dy = {-1, 0, 1, 0};
        
        boolean[][][] visited = new boolean[11][11][4];
        
        int x = 5;
        int y = 5;
        
        String[] dirArr = dirs.split("");
        for (String dirStr : dirArr) {
            int dir = dirMap.get(dirStr);
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if (nx < 0 || ny < 0 || nx >= 11 || ny >= 11) {
                continue;
            }
            
            int counterDir = (dir + 2) % 4;
            if (!visited[y][x][dir] && !visited[ny][nx][counterDir]) {       
                visited[y][x][dir] = true;
                visited[ny][nx][counterDir] = true;
                answer++;
            }
            
            x = nx;
            y = ny;
        }
        
        return answer;
    }
}
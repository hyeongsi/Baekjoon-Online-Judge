import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1}); // x, y, 길이
        
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int row = pos[0];
            int col = pos[1];
            int distance = pos[2];
            
            if (row == rows - 1 && col == cols - 1) {
                return distance;
            }
            
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                
                if (  newRow >= 0 && newRow < rows
                   && newCol >= 0 && newCol < cols
                   && maps[newRow][newCol] == 1) {
                    maps[newRow][newCol] = 0;
                    queue.add(new int[] {newRow, newCol, distance + 1});
                } 
            }
        }
        
        return -1;
    }
}
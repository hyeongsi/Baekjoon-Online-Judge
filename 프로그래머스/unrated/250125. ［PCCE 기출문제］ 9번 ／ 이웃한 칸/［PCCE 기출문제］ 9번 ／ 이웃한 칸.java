import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        
        int sameColorCnt = 0;
        String findColor = board[h][w];
        
        int[][] ckPos = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int boardSize = board.length;
        
        for(int[] pos : ckPos) {
            int ckH = h + pos[0];
            int ckW = w + pos[1];
            
            if (!isBoardRange(boardSize, ckH, ckW)) {
                continue;
            } 
            
            String ckColor = board[ckH][ckW];
            if (findColor.equals(ckColor)) {
                sameColorCnt++;
            }
      }
        
        return sameColorCnt;
    }
    
    public boolean isBoardRange(int boardSize, int h, int w) {
        if(h < 0 || h >= boardSize) {
            return false;
        }
        if(w < 0 || w >= boardSize) {
            return false;
        }
        
        return true;
    }
}
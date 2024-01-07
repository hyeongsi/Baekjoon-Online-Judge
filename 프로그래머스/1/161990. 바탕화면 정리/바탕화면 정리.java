import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[] { wallpaper.length, wallpaper[0].length(), 0, 0 };
        
        for (int i = 0; i < wallpaper.length; i++) {
            final int lx = wallpaper[i].indexOf("#"); 
            
            if (lx == -1) {
                continue;
            }

            final int rx = wallpaper[i].lastIndexOf("#"); 
            answer[0] = Math.min(answer[0], i);
            answer[1] = Math.min(answer[1], lx);
            answer[2] = Math.max(answer[2], i + 1);
            answer[3] = Math.max(answer[3], rx + 1);    
        }
        
        return answer;
    }
}
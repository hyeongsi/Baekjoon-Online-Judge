import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {   
        int[] answer = new int[(int)(right - left + 1)];
        for (int i = 0; i < answer.length; i++) {
            
            if (left / n <= left % n)
                answer[i] = (int)(left % n) + 1;
            else
                answer[i] = (int)(left / n) + 1;
            
            ++left;
        }
        
        return answer;
    }
}
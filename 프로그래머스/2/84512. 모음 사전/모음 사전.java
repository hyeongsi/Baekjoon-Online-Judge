import java.util.*;

class Solution {
    StringBuilder sb = new StringBuilder();
    char[] alpha = {'A', 'E', 'I', 'O', 'U'}; 
    boolean isFind = false;
    int answer = 0;
    
    public int solution(String word) {

        dfs(word);     
        return answer;
    }
    
    public void dfs(String word) {
        if (sb.toString().equals(word)) {
            isFind = true;
            return;
        }
        
        if (isFind) {
            return;
        }
        
        if (sb.length() > 5) {
            return;
        }
        answer++;
        
        for (int i = 0; i < 5; i++) {
            sb.append(alpha[i]);
            dfs(word);
            sb.deleteCharAt(sb.length() - 1);
        }
        
    }
}
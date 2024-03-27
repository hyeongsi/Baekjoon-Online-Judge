import java.util.*;

class Solution {
    int cnt = 0;
    boolean escape;
    
    String[] alpha = {"A", "E", "I", "O", "U"};
    String[] curWord = {"", "", "", "", ""};

    public int solution(String word) {
        
        dfs(0, word);
        return cnt;
    }
    
    public void dfs(int deep, String word) {
        ckWord(word);
        if (escape)
            return;
        if (deep > 4)
            return;
        
        for (int i = 0; i < 5; i++) {
            ckWord(word);
            if (escape)
                return;
            
            curWord[deep] = alpha[i];
            cnt++;
            
            dfs(deep + 1, word);
            curWord[deep] = "";
        }
    }
    
    public void ckWord(String word) {
        String str = "";
        for (int i = 0; i < 5; i++) {
            str += curWord[i];
        }
        
        if (str.equals(word))
            escape = true;
    }
}
import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        int[] answer = {0, 0};
        
        Set<String> set = new HashSet<>(); 
        char prev = words[0].charAt(0);
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char first = word.charAt(0);
            
            if(set.contains(word) || prev != first) {
                return new int[] {i % n + 1, i / n + 1};
            }

            prev = word.charAt(word.length() - 1);
            set.add(word);
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        final int CORRECTION = 4;
        for (int i = 0; i < choices.length; i++) {
            int score = choices[i] - CORRECTION;
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            
            if (score < 0) {
                map.put(left, map.getOrDefault(left, 0) + Math.abs(score));
            } else {
                map.put(right, map.getOrDefault(right, 0) + Math.abs(score));
            }
            
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(getCharacterType(map, 'R', 'T'));
        sb.append(getCharacterType(map, 'C', 'F'));
        sb.append(getCharacterType(map, 'J', 'M'));
        sb.append(getCharacterType(map, 'A', 'N'));
        
        return sb.toString();
    }
    
    public char getCharacterType(final HashMap<Character, Integer> map, char ch1, char ch2) {
        final int left = map.getOrDefault(ch1, 0);
        final int right = map.getOrDefault(ch2, 0);
        if (left < right){
            return ch2;
        }
        else if (left > right) {
            return ch1;
        }
        
        return ch1 < ch2 ? ch1 : ch2; 
    }
}
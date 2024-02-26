import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            final String style = clothes[i][1];
            final int clothesCnt = map.getOrDefault(style, 0);
            
            map.put(style, clothesCnt + 1);
        }
        
        int answer = 1;
        
        for (String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }   
        
        return answer - 1;
    }
}
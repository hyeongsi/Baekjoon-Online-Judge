import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        Map<Integer, Integer> map = new HashMap<>();
        String numStr = "";
        for (int i = 1; i < s.length() - 1; i++) {
            final char ch = s.charAt(i);
            
            switch (ch) {
                case '{':
                    numStr = "";
                    break;
                case ',':
                case '}': 
                    if (numStr.equals(""))
                        break;
                    
                    final int key = Integer.parseInt(numStr);
                    map.put(key, map.getOrDefault(key, 0) + 1);
                    numStr = "";
                    break;  
                default: numStr += ch; break;
            }
        }
        
        int[] answer = new int[map.size()];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            final int idx = map.size() - entry.getValue();
            answer[idx] = entry.getKey();
        }
        
        return answer;
    }
}
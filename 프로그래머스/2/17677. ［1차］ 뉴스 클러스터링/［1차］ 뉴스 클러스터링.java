import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        
        Map<String, Integer> str1Map = new HashMap<>();
        Map<String, Integer> str2Map = new HashMap<>();
        
        initSet(str1, str1Map);
        initSet(str2, str2Map);
        
        int unionCnt = 0;
        int intersectionCnt = 0;
        for (String key : str1Map.keySet()) {
            if (str2Map.containsKey(key)) {
                unionCnt += Math.min(str1Map.get(key), str2Map.get(key));
                intersectionCnt += Math.max(str1Map.get(key), str2Map.get(key));
                continue;
            }
                
            intersectionCnt += str1Map.get(key);
        }
        
        for (String key : str2Map.keySet()) {
            if (str1Map.containsKey(key)) {
                continue;
            }
            
            intersectionCnt += str2Map.get(key);
        }
        
        if (unionCnt == 0 &&
           intersectionCnt == 0) {
            return 65536;
        }
        
        double div = (double)unionCnt / intersectionCnt;
        return (int)(div * 65536);
    }
    
    public void initSet(String str, Map<String, Integer> map) {
        
        for (int i = 0; i < str.length() - 1; i++) {
            String split = str.substring(i, i + 2);
            
            if (!isAlphabet(split))
                continue;
            
            String lowerSplit = split.toLowerCase();
            map.put(lowerSplit, map.getOrDefault(lowerSplit, 0) + 1);
        }
        
    }
    
    public boolean isAlphabet(String str) {
        
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
}
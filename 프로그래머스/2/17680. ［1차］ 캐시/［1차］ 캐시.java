import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        
        if (cacheSize == 0)
            return cities.length * 5;
        
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
            
            if (list.contains(cities[i])) {
                answer += 1;
                list.remove(cities[i]);
                list.add(cities[i]);
                continue;
            } 
            
            answer += 5;
            if (list.size() == cacheSize) {
                list.remove(0);
                list.add(cities[i]);
            } else {
                list.add(cities[i]);
            }
        }
        
        return answer;
    }
}
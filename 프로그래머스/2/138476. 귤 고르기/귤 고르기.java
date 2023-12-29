import java.util.*;

class Solution { 
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            list.add(map.get(key));
        }
        
        list.sort(Collections.reverseOrder());
        
        int sum = 0;
        for (Integer value : list) {
            answer++;
            sum += value;
            
            if(sum >= k) {
                break;
            }
        }
        
        return answer;
    }
}
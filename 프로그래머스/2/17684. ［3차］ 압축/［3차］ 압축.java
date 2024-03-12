import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i <= 'Z' - 'A' ; i++) {
            String str = "" + (char)(i + 'A');
            map.put(str, i + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (true) {
            sb.append(msg.charAt(idx));
            
            if (map.containsKey(sb.toString())) {
                if (idx == msg.length() - 1) {
                    ans.add(map.get(sb.toString()));
                    break;
                }
                
                idx++;
            }
            else {
                map.put(sb.toString(), map.size() + 1);
                sb.deleteCharAt(sb.length() - 1);
                ans.add(map.get(sb.toString()));
                sb.setLength(0);
            }
            
        }
        
        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
}
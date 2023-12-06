import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        Map<Character, TreeSet<Integer>> map = new HashMap<>();
        for(String str : keymap){
            for(int i = 0; i < str.length(); i++){
                char key = str.charAt(i);
                
                TreeSet<Integer> treeSet = map.getOrDefault(key, new TreeSet<Integer>());
                treeSet.add(i + 1);
                
                map.put(key, treeSet);
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            for(int j = 0; j < targets[i].length(); j++){
                
                char key = targets[i].charAt(j);
                if(map.get(key) == null){
                    answer[i] = -1;
                    break;
                }
                
                answer[i] += map.get(key).first();
            }   
        }
        
        return answer;
    }
}
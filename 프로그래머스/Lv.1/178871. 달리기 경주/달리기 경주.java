import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map1.put(players[i], i + 1);
            map2.put( i + 1, players[i]);
        }
        
        for (String calling : callings) {
            int playerRank = map1.get(calling);
            String frontPlayerName = map2.get(playerRank - 1);
            
            map1.put(calling, playerRank - 1);
            map1.put(frontPlayerName, playerRank);
            
            map2.put(playerRank - 1, calling);
            map2.put(playerRank, frontPlayerName);
        }
        
        String[] answer = new String[players.length];
        for (int i = 1; i <= players.length; i++) {
            answer[i - 1] = map2.get(i);
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> card1Q = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> card2Q = new LinkedList<>(Arrays.asList(cards2));
          
        for(int i = 0; i < goal.length; i++){
            if(!card1Q.isEmpty() && card1Q.peek().equals(goal[i])){
                card1Q.poll();
            }else if(!card2Q.isEmpty() && card2Q.peek().equals(goal[i])){
                card2Q.poll();
            }else{
                return "No";
            }
        }
        
        
        return "Yes";
    }
}
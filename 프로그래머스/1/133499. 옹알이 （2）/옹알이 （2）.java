import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            StringBuilder sb = new StringBuilder();
            String prev = "";
            boolean isPass = false;
            for(int j = 0; j < babbling[i].length(); j++) {
                sb.append(babbling[i].charAt(j));
                
                if(sb.toString().equals(prev)){
                    isPass = false;
                    break;
                }
                
                for(String word : words){
                    if(sb.toString().equals(word)) {
                        isPass = true;
                        prev = sb.toString();
                        sb = new StringBuilder();
                        break;
                    }
                } 
            }
            if(sb.length() == 0){
                answer++;
            }
        }
        
        return answer;
    }
}
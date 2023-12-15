import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[2];
        
        while (!s.equals("1")) {

            StringBuilder sb = new StringBuilder();

            answer[0]++;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != '0') sb.append('1');
                else answer[1]++;
            }

            s = toBinary(sb.length());
            
        }
        
        return answer;
    }
    
    public String toBinary(int num) {
        
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.append(num % 2);
            num /= 2; 
        }
        
        return sb.reverse().toString();
    }
}
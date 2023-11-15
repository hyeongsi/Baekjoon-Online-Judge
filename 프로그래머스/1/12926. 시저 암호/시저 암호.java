import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c >= 'A' && c <= 'Z'){
                c += n;
                if(c > 'Z'){
                    c = (char)('A' + (c - 'Z') - 1);
                }
            } else if(c >= 'a' && c <= 'z'){
                c += n;
                if(c > 'z'){
                    c = (char)('a' + (c - 'z') - 1);
                }
            } 
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}
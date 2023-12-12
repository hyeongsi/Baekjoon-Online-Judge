import java.util.*;

class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        String[] str = s.toLowerCase().split("");
        boolean flag = true;
        
        for(String ss : str) {
            sb.append(flag ? ss.toUpperCase() : ss);
            flag = ss.equals(" ") ? true : false;
        }

        return sb.toString();
    }
}
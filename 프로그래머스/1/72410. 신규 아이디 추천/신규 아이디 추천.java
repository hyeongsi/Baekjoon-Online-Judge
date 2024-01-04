import java.util.*;

class Solution {
    public String solution(String new_id) {
        
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9._-]", "");
        new_id = new_id.replaceAll("[.]{2,}", ".");
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        new_id = new_id.isEmpty() ? "a" : new_id; 
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }
        new_id = new_id.replaceAll("[.]$", "");
        
        StringBuilder sb = new StringBuilder(new_id);
        while (sb.length() <= 2) {
            sb.append(sb.charAt(sb.length() - 1));
        }
        new_id = sb.toString();

        return new_id;
    }

}
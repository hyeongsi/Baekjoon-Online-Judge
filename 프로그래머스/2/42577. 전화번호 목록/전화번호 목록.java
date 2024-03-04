import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        String prevStr = phone_book[0];
        for (int i = 1; i < phone_book.length; i++) {
            final String phone = phone_book[i];
            
            if (prevStr.length() <= phone.length()) {
                if ( prevStr.equals(phone.substring(0, prevStr.length())) ) {
                    return false;
                }
            }
            
            prevStr = phone_book[i];
        }
        
        return answer;
    }
}
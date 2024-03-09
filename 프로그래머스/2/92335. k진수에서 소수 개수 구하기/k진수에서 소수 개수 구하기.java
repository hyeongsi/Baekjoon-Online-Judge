import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String convert = Integer.toString(n, k);
        
        String str = "";
        for (int i = 0; i < convert.length(); i++) {
            char ch = convert.charAt(i);
            
            if (ch != '0') {
                str += ch;
            }
            else if (str.length() != 0){
                if (isPrime(Long.parseLong(str))) {
                    answer++;
                }
                
                str = "";
            }
        }
        
        if (str.length() != 0) {
            if (isPrime(Long.parseLong(str))) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        
        if (n == 2){
            return true;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        
        return true;
    }
}
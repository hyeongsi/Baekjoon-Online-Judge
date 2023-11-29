import java.util.*;

class Solution {
    public int solution(String dartResult) {
    
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            if(Character.isDigit(ch)) {
                if(ch == '1' && dartResult.charAt(i + 1) == '0') {
                    stack.add(10);
                    i++;
                    continue;
                }
                
                stack.add(ch - '0');
            } 
            else {
                int prev = stack.pop();
                
                if(ch == 'D'){
                    prev *= prev;
                }
                else if(ch == 'T'){
                    prev = prev * prev * prev;
                }
                else if(ch == '*') {
                    if(!stack.isEmpty()){
                        stack.add(stack.pop() * 2);
                    }
                    prev *= 2;
                }
                else if(ch == '#') {
                    prev *= -1;
                }
                
                stack.push(prev);
            } 
        }
        
        int answer = 0;
        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        
        return answer;
    }
}
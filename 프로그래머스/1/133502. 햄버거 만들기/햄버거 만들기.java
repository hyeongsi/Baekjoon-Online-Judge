import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < ingredient.length; i++) {
            int num = ingredient[i];
            stack.push(num);
            int stackSize = stack.size();
            
            if (num == 1 && stackSize >= 4) {
                if(stack.get(stackSize - 2) == 3 && stack.get(stackSize - 3) == 2  && stack.get(stackSize - 4) == 1) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }     
        
        return answer;
    }
}
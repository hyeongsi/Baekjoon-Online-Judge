import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> bucket = new Stack<>();
        
        for (int i = 0; i < moves.length; i++) {
            int xIdx = moves[i] - 1;
            
            for (int j = 0; j < board.length; j++) {
                int bNum = board[j][xIdx];
                
                if(bNum != 0) {
                    board[j][xIdx] = 0;
                    
                    System.out.println(bNum);
                    
                    if(!bucket.isEmpty() && bucket.peek() == bNum) {
                        bucket.pop();
                        answer+=2;
                    }
                    else {
                        bucket.add(bNum);
                    }
                    
                    break;
                }
            }
        }
        
        
        return answer;
    }
}
import java.util.*;

class Solution {
    int[][] numPadPos = {
        {3, 1}, // 0
        {0, 0}, // 1
        {0, 1}, // 2
        {0, 2}, // 3
        {1, 0}, // 4
        {1, 1}, // 5
        {1, 2}, // 6
        {2, 0}, // 7
        {2, 1}, // 8
        {2, 2}, // 9 
    };
    
    int[] lPos = {3,0};
    int[] rPos = {3,2};
    String myhand;
    
    public String solution(int[] numbers, String hand) {       
        StringBuilder sb = new StringBuilder();
        myhand = hand.equals("right") ? "R" : "L";
        
        for (int number : numbers) {
            String thumb = pushKeyThumb(number);
            sb.append(thumb);
            
            if (thumb.equals("L")) {
                lPos = numPadPos[number];
            }
            else if (thumb.equals("R")) {
                rPos = numPadPos[number];
            }
        }
        
        return sb.toString();
    }
    
    public String pushKeyThumb(int num) {
        switch (num) {
            case 1: case 4: case 7:
                return "L";
            case 3: case 6: case 9:
                return "R";
        }
        
        int rDist = getDist(rPos, num);
        int lDist = getDist(lPos, num);
        
        if (rDist > lDist) {
            return "L";
        }
        if (rDist < lDist) {
            return "R";
        }
        
        return myhand;
    }
    
    public int getDist(int[] pos, int num) {
        return Math.abs(pos[0] - numPadPos[num][0]) + Math.abs(pos[1] - numPadPos[num][1]);
    }
}
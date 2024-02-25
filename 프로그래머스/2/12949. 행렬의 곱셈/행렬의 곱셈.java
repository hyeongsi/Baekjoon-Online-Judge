import java.util.*;

class Solution {
    public int[][] solution(int[][] A, int[][] B) {
        int lX = A.length;
        int lY = B[0].length;
        int[][] answer = new int[lX][lY];

        for (int i = 0; i < lX; i++) {
            for (int j = 0; j < lY; j++) {
                int value = 0;
                for (int k = 0; k < A[0].length; k++) {
                    value += A[i][k] * B[k][j];
                }
                answer[i][j] = value;
            }
        }
        return answer;
    }
}
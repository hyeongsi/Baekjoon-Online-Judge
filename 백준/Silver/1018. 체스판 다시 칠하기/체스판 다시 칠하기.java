import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    final static int loop = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String[] board = new String[input[0]];
        for (int i = 0; i < board.length; i++) {
            board[i] = br.readLine();
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= input[0] - loop; i++) {
            for (int j = 0; j <= input[1] - loop; j++) {
                ans = Math.min(ans, getFixColor(board.clone(), i, j));
            }
        }

        System.out.println(ans);
    }

    private static int getFixColor(String[] board, int y, int x) {
        int fixCnt = 0;
        Color prevColor = Color.W;

        for (int i = 0; i < loop; i++) {
            for (int j = 0; j < loop; j++) {

                if (board[y + i].charAt(x + j) != prevColor.getName()) {
                    fixCnt++;
                }

                if (loop - 1 != j) {
                    prevColor = Color.W == prevColor ? Color.B : Color.W;
                }
            }
        }

        return Math.min(fixCnt, 64 - fixCnt);
    }

    private enum Color {
        W('W'),
        B('B');

        final private char name;
        public char getName() {
            return name;
        }
        private Color(char name) {
            this.name = name;
        }
    }

}
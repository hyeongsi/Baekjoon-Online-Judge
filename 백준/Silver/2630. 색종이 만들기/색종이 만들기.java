import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] paper = null;
    static int[] colorCnt = new int[2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        // setPaperColor
        paper = new int[loop][loop];
        for (int i = 0; i < loop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < loop; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // findSplitColorCnt
        findSplitColorCnt(0, 0, loop);
        System.out.println(colorCnt[0]);
        System.out.println(colorCnt[1]);
    }

    private static void findSplitColorCnt(int x, int y, int splitSize) {
        int color = paper[y][x];

        if (splitSize == 1) {
            colorCnt[color]++;
            return;
        }

        for (int i = y; i < y + splitSize; i++) {
            for (int j = x; j < x + splitSize; j++) {
                if (color != paper[i][j]) {
                    findSplitColorCnt(x, y, splitSize/2);
                    findSplitColorCnt(x + splitSize/2, y, splitSize/2);
                    findSplitColorCnt(x, y + splitSize/2, splitSize/2);
                    findSplitColorCnt(x + splitSize/2, y + splitSize/2, splitSize/2);
                    return;
                }
            }
        }

        colorCnt[color]++;
    }
}
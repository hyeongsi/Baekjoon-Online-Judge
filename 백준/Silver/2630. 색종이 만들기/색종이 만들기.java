import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer paperSize = Integer.parseInt(br.readLine());

        String[][] paper = new String[paperSize][paperSize];
        for (int i = 0; i < paperSize; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < paperSize; j++) {
                paper[i][j] = st.nextToken();
            }
        }

        CountColor(paper, paperSize, 0, 0);

        System.out.println(white);
        System.out.println(blue);

    }// end main

    public static void CountColor(String[][] paper, int checkSize, int x, int y) {
        final int ckHalf = checkSize / 2;
        final String firstColor = paper[y][x];

        for (int i = y; i < y + checkSize; i++) {
            for (int j = x; j < x + checkSize; j++) {
                if (!firstColor.equals(paper[i][j])) {
                    CountColor(paper, ckHalf, x, y);
                    CountColor(paper, ckHalf, x + ckHalf, y);
                    CountColor(paper, ckHalf, x, y + ckHalf);
                    CountColor(paper, ckHalf, x + ckHalf, y + ckHalf);
                    return;
                }
            }
        }

        if (firstColor.equals("1")) {
            blue++;
        } else {
            white++;
        }

    }

}


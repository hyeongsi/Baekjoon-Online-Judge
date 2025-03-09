import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int LOOP = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] words = new String[LOOP][];
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < LOOP; i++) {
            words[i] = br.readLine().split("");
        }

        int loopCnt = 0;
        while (loopCnt < 75) {
            if (words[loopCnt % LOOP].length > loopCnt / LOOP) {
                sb.append(words[loopCnt % LOOP][loopCnt / LOOP]);
            }
            loopCnt++;
        }

        System.out.println(sb);
    }

}
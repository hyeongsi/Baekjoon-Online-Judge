import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int tCnt = Integer.parseInt(br.readLine());

        int[] coins = {25, 10, 5, 1};
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tCnt; i++) {
            int change = Integer.parseInt(br.readLine());

            for (int j = 0; j < coins.length; j++) {
                sb.append(change / coins[j] + " ");
                change %= coins[j];
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }

}
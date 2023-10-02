import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[15][15];

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {

                if(i == 0){
                    dp[i][j] = j+1;
                }else if (j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(dp[k][n-1]);
        }
    }
}

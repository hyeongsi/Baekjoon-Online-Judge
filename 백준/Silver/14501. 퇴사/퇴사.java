import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][]arr = new int[N+1][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());   // 상담 소요시간
            arr[i][1] = Integer.parseInt(st.nextToken());   // 상담 보수
        }

        int[]dp = new int[N+1];
        int max = 0;
        for (int i = N; i >= 0; i--) {
            int completeDay = i + arr[i][0];  // 완료 날짜
            if(!(completeDay > N)){
                dp[i] = dp[completeDay] + arr[i][1];
            }

            dp[i] = Math.max(max, dp[i]);
            max = dp[i];
        }

        System.out.println(max);
    }
}
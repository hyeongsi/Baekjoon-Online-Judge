import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static long[][] dp;
	static long result = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		dp = new long[N][10];

		for (int i = 1; i < 10; i++) {
			dp[0][i] = 1;
			result += dp[0][i];
		}
		dp[0][0] = 1;
		
		for(int i = 1; i < N; i++) {
			result = 0;
			for(int j = 1; j < 10; j++) {
				if(j != 9) {
					dp[i][j] = dp[i-1][j+1] % 1000000000;
				}
				dp[i][j] += dp[i-1][j-1] % 1000000000;
				
				if(i == N-1) {
					result += dp[i][j];					
				}
			}
			dp[i][0] = dp[i-1][1] % 1000000000;
		}
		
		System.out.println(result % 1000000000);
	}
}

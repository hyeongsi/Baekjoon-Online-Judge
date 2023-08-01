import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int[][] dp;
	static int N;
	static int max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int loop = Integer.parseInt(br.readLine());
		
		for(int l = 0; l < loop; l++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[2][N+1];
			dp = new int[2][N+1];
			max = Integer.MIN_VALUE;
			
			for(int i = 0; i < 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());		
				for(int j = 1; j <= N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());				
				}
			}
			
			for(int i = 1; i <= N; i++) {
				if(i == 1) {
					dp[0][i] = dp[1][i-1] + arr[0][i];
					dp[1][i] = dp[0][i-1] + arr[1][i];
					max = Math.max(max, Math.max(dp[0][i], dp[1][i]));
					continue;
				}
				
				dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + arr[0][i];
				dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + arr[1][i];
				max = Math.max(max, Math.max(dp[0][i], dp[1][i]));
			}
			
			sb.append(max).append('\n');
		}
		
		System.out.println(sb);
	}
}
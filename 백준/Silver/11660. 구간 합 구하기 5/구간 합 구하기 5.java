import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	// 크기
		int M = Integer.parseInt(st.nextToken());	// 합을 구해야 하는 횟수

		int[][] dp = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());	// N개의 수
			for(int j = 1; j<= N; j++) {
				dp[i][j] = dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1] + Integer.parseInt(st.nextToken());				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int l = 1; l <= M; l++) {
			st = new StringTokenizer(br.readLine());	// N개의 수
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1];
			sb.append(result).append("\n");
		}
		
		System.out.println(sb);
	}
}

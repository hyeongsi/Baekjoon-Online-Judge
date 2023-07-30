import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int[] dp;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[N-1] = 1;
		
		int max = 0;
		for(int i = 0; i < N; i++) {
			find(i);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
	
	static int find(int n) {
		if(dp[n] == 0) {
			dp[n] = 1;
			for(int i = n; i < N; i++) {
				if(arr[n] > arr[i]) {
					dp[n] = Math.max(dp[n], find(i) + 1);
				}
			}
		}
		
		return dp[n];
	}
}
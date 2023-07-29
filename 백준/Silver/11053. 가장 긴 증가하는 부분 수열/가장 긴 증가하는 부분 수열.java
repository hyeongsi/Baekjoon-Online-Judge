import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int[] dp;
	static int max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		arr = new int[N + 1];
		dp = new int[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());		
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = 0;
		dp[1] = 1;
		max = dp[1];
		
		for(int i = 2; i <= N; i++) {
			for(int j = i-1; j >= 1; j--) {
				if(arr[i] <= arr[j])
					continue;
				
				dp[i] = Math.max(dp[j], dp[i]);
			}
			dp[i]+=1;
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
	}
}
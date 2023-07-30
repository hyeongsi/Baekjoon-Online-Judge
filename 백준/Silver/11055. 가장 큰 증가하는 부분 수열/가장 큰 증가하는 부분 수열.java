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
		arr = new int[N];
		dp = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		max = dp[0];
		
		for(int i = 1; i < N; i++) {
			dp[i] = arr[i];
			for(int j = i-1; j >= 0; j--) {
				if(!(arr[i] > arr[j]))
					continue;
				
				dp[i] = Math.max(dp[i], dp[j] + arr[i]);
			}
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
	}
}
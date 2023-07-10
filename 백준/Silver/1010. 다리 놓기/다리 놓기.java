import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] dp = new int[30][30];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());

		for (int l = 0; l < loop; l++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			System.out.println(combination(k, n));
		}
	}

	public static int combination(int n, int r) {
		if (dp[n][r] > 0) {
			return dp[n][r];
		} else if (n == r || r == 0) {
			return dp[n][r] = 1;
		} else {
			return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
		}
	}
}
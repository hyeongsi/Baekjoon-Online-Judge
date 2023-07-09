import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		boolean[] num = new boolean[1000001];
		for (int i = 2; i * i < num.length; i++) {
			if (isPrime(i)) {
				for (int j = i * i; j < num.length; j += i) {
					num[j] = true;
				}
			}
		}

		for (int i = 0; i < t; i++) {
			int ans = 0;
			int n = Integer.parseInt(br.readLine());

			for (int j = 2; j <= n / 2; j++) {
				if (!num[j] && !num[n - j]) {
					ans++;
				}
			}

			System.out.println(ans);
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
}
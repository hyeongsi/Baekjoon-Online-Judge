import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int ans = factorial(n) / (factorial(n-k) * factorial(k));
		
		System.out.println(ans);
	}
	
	public static int factorial(int n) {
		int result = 1;
		
		for(int i = n; i >= 2; i--) {
			result *= i;
		}
		
		return result;
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());

		int[] arr = new int[loop];
		for (int i = 0; i < loop; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		int minGcd = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int value = arr[i + 1] - arr[i];
			minGcd = gcd(value, minGcd);
		}

		System.out.println(((arr[arr.length - 1] - arr[0]) / minGcd + 1) - arr.length);
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}
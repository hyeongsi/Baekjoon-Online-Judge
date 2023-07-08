import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());

		int e = (a * d) + (c * b);
		int f = b * d;

		int g = gcd(e, f);

		System.out.println(e / g + " " + f / g);
	}

	public static int gcd(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}
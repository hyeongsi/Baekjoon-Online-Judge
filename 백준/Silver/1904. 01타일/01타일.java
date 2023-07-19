import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int size[] = new int[1000001];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		size[0] = 0;
		size[1] = 1;
		size[2] = 2;

		for (int i = 3; i < size.length; i++) {
			size[i] = -1;
		}

		System.out.println(tile(n));
	}

	public static int tile(int n) {
		if (size[n] == -1) {
			size[n] = (tile(n - 1) + tile(n - 2)) % 15746;
		}

		return size[n];
	}
}

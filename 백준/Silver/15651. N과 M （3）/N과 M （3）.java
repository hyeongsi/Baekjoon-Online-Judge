import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] arr;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N + 1];

		recursion(0);
		System.out.println(sb);
	}

	public static void recursion(int n) {
		if(n == M) {
			for(int i = 0; i < M; i++) {
				sb.append(arr[i]).append(' '); 
			}
			sb.append('\n');
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			arr[n] = i;
			
			recursion(n+1);
		}
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static long tcase[] = new long[101];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		tcase[1] = 1;
		tcase[2] = 1;
		tcase[3] = 1;
		
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(P(n));
		}
	}
	
	public static long P(int n) {
		if(tcase[n] == 0) {
			tcase[n] = P(n-2) + P(n-3);
		}

		return tcase[n];
	}
}

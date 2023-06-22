import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] bucket = new int[n];
		int i_b, j_b, k_b;
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			i_b = Integer.parseInt(st.nextToken());
			j_b = Integer.parseInt(st.nextToken());
			k_b = Integer.parseInt(st.nextToken());
			
			for(int j = i_b; j <= j_b; j++)
				bucket[j-1] = k_b;
		}
		
		for(int i : bucket) {
			System.out.print(i + " ");
		}
	}
}
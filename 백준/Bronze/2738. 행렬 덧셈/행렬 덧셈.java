import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] size = br.readLine().split(" ");
		int n = Integer.parseInt(size[0]);
		int m = Integer.parseInt(size[1]);
		
		int[][] matrix = new int[n][m];
		
		for(int k = 0; k < 2; k++) {
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < m; j++) {
					int value = Integer.parseInt(st.nextToken());
					
					if(k == 0)
						matrix[i][j] = value;
					else
						matrix[i][j] = matrix[i][j] + value;
				}
			}
		}
		
		for(int[] e:matrix) {
			for(int f:e) {
				System.out.print(f + " ");
			}
			System.out.println("");
		}
		
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int loop = Integer.parseInt(br.readLine());
		boolean[][] paper = new boolean[100][100];
		
		// 입력
		for(int i = 0; i < loop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			for(int j = y; (j <= 100) && (j < y + 10); j++) {
				for(int k = x; (k <= 100) && (k < x + 10); k++) {
					paper[j-1][k-1] = true;
				}
			}
		}
		
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(paper[i][j])
					sum++;
			}
		}
		
		System.out.println(sum);
	}
}
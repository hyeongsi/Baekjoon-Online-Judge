import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	// 크기
		int M = Integer.parseInt(st.nextToken());	// 합을 구해야 하는 횟수

		int[][] arr = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());	// N개의 수
			for(int j = 1; j<= N; j++) {
				arr[i][j] = arr[i][j-1] + Integer.parseInt(st.nextToken());				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int l = 1; l <= M; l++) {
			st = new StringTokenizer(br.readLine());	// N개의 수
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			long sum = 0;
			for(int i = x1; i <= x2; i++) {
				sum += arr[i][y2] - arr[i][y1-1];
			}
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
}

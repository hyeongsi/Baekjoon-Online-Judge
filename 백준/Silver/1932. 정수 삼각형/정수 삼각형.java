import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[][] arr;
	static Integer[][] path;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		path = new Integer[N][N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		path[0][0] = arr[0][0];
		System.out.println(dp());
	}
	
	public static int dp() {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			max = Math.max(max, dp(N-1, i));
		}
		
		return max;
	}
	
	public static int dp(int deep, int idx) {
		if(deep < 0 || deep >= N || idx < 0 || idx >= N)
			return -1;
		
		if(path[deep][idx] == null) {
			path[deep][idx] = arr[deep][idx] + Math.max(dp(deep-1, idx-1), dp(deep-1, idx));
		}
		
		return path[deep][idx];
	}
}

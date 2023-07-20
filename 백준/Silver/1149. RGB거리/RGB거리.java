import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[][] arr;
	static int[][] minArr;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][3];
		minArr = new int[N][3];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		
		minArr[0][0] = arr[0][0];
		minArr[0][1] = arr[0][1];
		minArr[0][2] = arr[0][2];
		
		System.out.println(dp(N-1));
	}
	
	static int dp(int n) {
		return Math.min(Math.min(dp(n,0), dp(n,1)), dp(n,2));
	}
	
	static int dp(int deep, int idx) {
		if(minArr[deep][idx] == 0) {
			if(idx == 0) {
				minArr[deep][idx] = arr[deep][idx] + Math.min(dp(deep-1,1), dp(deep-1,2));
			}
			else if(idx==1) {
				minArr[deep][idx] = arr[deep][idx] + Math.min(dp(deep-1,0), dp(deep-1,2));
			}
			else {
				minArr[deep][idx] = arr[deep][idx] + Math.min(dp(deep-1,0), dp(deep-1,1));
			}
		}
		
		return minArr[deep][idx];
	}
}

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
		
		System.out.println(Math.min(Math.min(minCost(N-1,0), minCost(N-1,1)), minCost(N-1,2)));
	}
	
	static int minCost(int deep, int idx) {
		if(minArr[deep][idx] != 0)
			return minArr[deep][idx];
		
		switch (idx) {
		case 0:
			return minArr[deep][idx] = arr[deep][0] + Math.min(minCost(deep-1, 1), minCost(deep-1, 2));
		case 1:
			return minArr[deep][idx] = arr[deep][1] + Math.min(minCost(deep-1, 0), minCost(deep-1, 2));
		default:
			return minArr[deep][idx] = arr[deep][2] + Math.min(minCost(deep-1, 0), minCost(deep-1, 1));
		}
		
	}
}

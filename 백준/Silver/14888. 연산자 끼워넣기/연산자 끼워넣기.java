import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr, op;
	static int N;
	
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());	
		
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		op = new int[4];
		for(int i = 0; i < 4; i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}
	
		dfs(arr[0], 1);
		System.out.println(max);
		System.out.println(min);
	}
	
	static void dfs(int num, int idx) {
		if(idx == N) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			if(op[i] <= 0)
				continue;
			
			op[i]--;
			
			switch (i) {
			case 0: dfs(num + arr[idx], idx+1); break;
			case 1: dfs(num - arr[idx], idx+1); break;
			case 2: dfs(num * arr[idx], idx+1); break;
			case 3: dfs(num / arr[idx], idx+1); break;
			}
			
			op[i]++;
		}
	}
}

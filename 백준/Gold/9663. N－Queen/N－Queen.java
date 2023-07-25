import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int[] arr;
	static int result = 0;
	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		nqueen(0);
		System.out.println(result);
	}
	
	public static void nqueen(int deep) {
		if(deep == N) {
			result++;
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			if(place(deep, i)) {
				arr[deep] = i;
				nqueen(deep+1);
				arr[deep] = 0;
			}
		}
	}
	
	public static boolean place(int deep, int idx) {
		int down = idx - deep; // 우하단 대각
		int up = idx + deep; // 우상단 대각
		
		for(int i = 0; i < N; i++) {
			if(arr[i] == 0)
				continue;
			
			// 상하 판별
			if(arr[i] == idx) {
				return false;
			}
			
			// 대각 판별
			int fdown = arr[i] - i;
			int fup = arr[i] + i;
			
			if(fdown == down) {
				return false;
			}
			if(fup == up) {
				return false;
			}
		}
		
		return true;
	}
}

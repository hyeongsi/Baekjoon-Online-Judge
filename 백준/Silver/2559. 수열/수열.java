import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	// 온도를 측정한 전체 날짜의 수
		int K = Integer.parseInt(st.nextToken());	// 합을 구하기 위한 연속적인 날짜의 수
		
		int[] arr = new int[N];
		int max = Integer.MIN_VALUE;
		int dp = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < K-1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp += arr[i];
		}
		
		for(int i = K-1; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp += arr[i];
			max = Math.max(max, dp);
			dp -= arr[i+1-K];
		}
		
		System.out.println(max);
	}
}

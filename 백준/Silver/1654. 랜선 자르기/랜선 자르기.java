import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());	// 오영식이 이미 가지고 있는 랜선의 개수
		int N = Integer.parseInt(st.nextToken());	// 필요한 랜선의 개수

		int[] arr = new int[K];
		
		long max = 0;
		for(int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]);
		}
		
		max++;
		
		long min = 0;
		long mid = 0;
		
		while(min < max) {
			mid = (max + min) / 2;
			// lo + (hi-lo) / 2;
			long cnt = 0;
			
			for(int i = 0; i < arr.length; i++) {
				cnt += (arr[i] / mid);
			}
			
			if(cnt < N) {
				max = mid;
			}else {
				min = mid + 1;
			}
		}
		
		System.out.println(min-1);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());	
		}
		
		Arrays.sort(arr, (int[] o1, int[] o2) -> {
			if(o1[1] == o2[1])
				return o1[0] - o2[0];
			
			return o1[1] - o2[1];
		});
		
		int cnt = 0;
		int prev_end_time = 0;
		
		for(int i = 0; i < N; i++) {
			if(prev_end_time <= arr[i][0]) {
				prev_end_time = arr[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());	// k개 가지고있음
		int n = Integer.parseInt(st.nextToken());	// n개 뽑기
		
		String[] arr = new String[k];
		
		int max = 0;
		for(int i = 0; i < k; i++) {
			arr[i] = br.readLine();
			max = Math.max(max, Integer.parseInt(arr[i]));
		}
		
		Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
		
		boolean flag = true;
		
		StringBuilder sb = new StringBuilder();
		for(String s : arr) {
			sb.append(s);
			if(max == Integer.parseInt(s) && flag) {
				for(int i = k; i < n; i++) {
					sb.append(s);
					flag = false;
				}		
			}
		}

		System.out.println(sb.toString());
	}	
}
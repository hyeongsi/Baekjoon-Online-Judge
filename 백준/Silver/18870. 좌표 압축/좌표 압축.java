import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		Arrays.sort(arr2);
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		int r = 0;
		for(int v : arr2) {
			if(!hashMap.containsKey(v)) {
				hashMap.put(v, r++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int k : arr1) {
			sb.append(hashMap.get(k) + " ");
		}
		
		System.out.println(sb);
	}
}
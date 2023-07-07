import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			map.put(br.readLine(), 1);
		}
		
		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			map.put(str, map.getOrDefault(str, 0)+1);
		}
		
		ArrayList<String> arr = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() >= 2) {
				arr.add(entry.getKey());
			}
		}
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr.size() + "\n");
		for(String str : arr) {
			sb.append(str + "\n");
		}
		
		System.out.println(sb);
	}
	
}
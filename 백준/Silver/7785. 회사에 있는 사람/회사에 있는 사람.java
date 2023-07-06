import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Boolean> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			boolean isEnter = (st.nextToken().equals("enter")) ? true : false;
			map.put(name, isEnter);
		}
		
		ArrayList<String> list = new ArrayList<>();
		for(String key : map.keySet()) {
			if(map.get(key)) {
				list.add(key);
			}
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for(String str: list) {
			sb.append(str + "\n");
		}
		System.out.println(sb);
	}
}
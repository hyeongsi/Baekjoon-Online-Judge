import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		String[] strArr = new String[n+1];
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			strArr[i+1] = str;
			map.put(str, i+1);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			if(isInteger(str)) {
				sb.append(strArr[Integer.parseInt(str)]);
			}
			else {
				sb.append(map.get(str));
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}

	}
}
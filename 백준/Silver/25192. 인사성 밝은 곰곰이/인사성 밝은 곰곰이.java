import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());

		HashMap<String, Integer> map = new HashMap<>();
		
		int cnt = 0;
		br.readLine();	// 처음 ENTER 제거
		for (int l = 1; l < loop; l++) {
			String str = br.readLine();
			if(str.equals("ENTER")) {
				cnt += map.size();
				map.clear();
			}else {
				map.put(str, map.getOrDefault(str, 0)+1);
			}
		}
		
		cnt += map.size();
		System.out.println(cnt);
	}
}
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
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if (str.length() < m)
				continue;

			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		ArrayList<WDict> arr = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			WDict dict = new WDict();
			dict.words = entry.getKey();
			dict.preq = entry.getValue();
			arr.add(dict);
		}

		Collections.sort(arr, (wd1, wd2) -> {
			if (wd1.preq != wd2.preq) {
				return wd2.preq - wd1.preq;
			} 
			else if (wd1.words.length() != wd2.words.length()) {
				return wd2.words.length() - wd1.words.length();
			} 
			else {
				return wd1.words.compareTo(wd2.words);
			}
		});

		StringBuilder sb = new StringBuilder();
		for (WDict dict : arr) {
			sb.append(dict.words).append("\n");
		}

		System.out.println(sb);
	}
}

class WDict {
	String words;
	int preq;
}

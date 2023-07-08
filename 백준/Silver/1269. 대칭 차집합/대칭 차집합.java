import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashSet<Integer> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(set.contains(temp)) {
				set.remove(temp);
			}
			else {
				set.add(temp);
			}
		}
		
		System.out.println(set.size());
	}
	
}
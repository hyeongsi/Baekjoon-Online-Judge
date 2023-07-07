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
		
		HashSet<Integer> setA = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}
		
		HashSet<Integer> setB = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		for(int i = 0; i < m; i++) {
			int value = Integer.parseInt(st.nextToken());
			setB.add(value);
			if(setA.contains(value))
				cnt++;
		}
		
		for(int i : setA) {
			if(setB.contains(i))
				cnt++;
		}
		
		System.out.println(setA.size() + setB.size() - cnt);
	}
	
}
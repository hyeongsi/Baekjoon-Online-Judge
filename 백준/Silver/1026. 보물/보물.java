import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> listA = new LinkedList<>();
		List<Integer> listB = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			listA.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			listB.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(listA);
		Collections.sort(listB);
		Collections.reverse(listB);
		
		int sum = 0;
		for(int i = 0; i < listA.size(); i++) {
			sum += listA.get(i) * listB.get(i);
		}
		
		System.out.println(sum);
	}		
}
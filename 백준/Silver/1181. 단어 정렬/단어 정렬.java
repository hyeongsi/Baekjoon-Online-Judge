import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		for(int i = 0; i < k; i++) {
			set.add(br.readLine());
		}
		
		List<String> list = new ArrayList<>(set);
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int o1l = o1.length();
				int o2l = o2.length();
				
				if(o1l > o2l) {
					return 1;
				}
				else if(o1l < o2l) {
					return -1;
				}
				else {
					return o1.compareTo(o2);
				}
			}
		});
		
		for(String s: list) {
			System.out.println(s);
		}
		
	}	
}
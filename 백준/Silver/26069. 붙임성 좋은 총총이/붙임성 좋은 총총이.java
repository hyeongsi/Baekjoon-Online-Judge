import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());

		HashSet<String> set = new HashSet<>();
		set.add("ChongChong");
		for(int l = 0; l < loop; l++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String p1 = st.nextToken();
			String p2 = st.nextToken();
			
			if(set.contains(p1) || set.contains(p2)) {
				set.add(p1);
				set.add(p2);
			}				
		}
		
		System.out.println(set.size());
	}
}
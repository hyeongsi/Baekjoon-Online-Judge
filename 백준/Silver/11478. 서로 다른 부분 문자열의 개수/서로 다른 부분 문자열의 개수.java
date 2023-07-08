import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		HashSet<String> set = new HashSet<>();
		int c = str.length();
		while(c > 0) {
			for(int i = 0; i <= str.length() - c; i++) {
				set.add(str.substring(i, i + c));
			}
			c--;
		}
		
		System.out.println(set.size());
	}
}
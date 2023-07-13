import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			cnt = 0;
			String str = br.readLine();
			sb.append(recursion(str, 0, str.length()-1) + " " + cnt + "\n");
		}
		
		System.out.println(sb);
	}
	
	static int recursion(String s, int l, int r){
		cnt++;
	    if(l >= r) return 1;
	    else if(s.charAt(l) != s.charAt(r)) return 0;
	    else return recursion(s, l+1, r-1);
	}
}

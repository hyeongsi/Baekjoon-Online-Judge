import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int loop = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < loop; i++) {
			Stack<Character> stack = new Stack<>();
			String str = br.readLine();
			String ans = "YES";
			
			for(int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				
				if(c == '(') {
					stack.add(c);
				}
				else {
					if(stack.isEmpty()) {
						ans = "NO";
						break;
					}
					else 
						stack.pop();
				}
			}
			
			if(!stack.isEmpty())
				ans = "NO";
		
			sb.append(ans + "\n");
		}
		
		System.out.println(sb.toString());
	}		
}
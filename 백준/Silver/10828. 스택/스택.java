import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < loop; i++) {
			st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			if(str.equals("push")) {
				int n = Integer.parseInt(st.nextToken());
				stack.add(n);
			}
			else if(str.equals("top")) {
				if(stack.isEmpty())
					System.out.println(-1);
				else
					System.out.println(stack.peek());
			}
			else if(str.equals("size")) {
				System.out.println(stack.size());
			}
			else if(str.equals("empty")) {
				if(stack.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			}
			else if(str.equals("pop")) {
				if(stack.isEmpty())
					System.out.println(-1);
				else
					System.out.println(stack.pop());
			}
			
		}	
	}	
}	
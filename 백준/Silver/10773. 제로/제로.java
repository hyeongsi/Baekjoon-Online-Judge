import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < n ; i++) {
			int m = Integer.parseInt(br.readLine());
			if(m == 0) {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}
			else {
				stack.push(m);				
			}
		}
		
		int sum = 0;
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		
		System.out.println(sum);
	}
}

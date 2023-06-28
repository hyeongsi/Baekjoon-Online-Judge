import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int loop = Integer.parseInt(br.readLine());
		
		int[] arr = new int[loop+1];
		for(int i = 1; i < loop+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Integer> stack = new Stack<>();
		int popIndex = 1;
		for(int i = 1; i < loop+1; i++) {
			stack.add(i);
			sb.append("+\n");
			
			while(!stack.isEmpty() && stack.peek() == arr[popIndex]) {
				popIndex++;
				stack.pop();
				sb.append("-\n");
			}
		}
		
		if(!stack.isEmpty())
			System.out.println("NO");
		else
			System.out.println(sb.toString());
	}		
}
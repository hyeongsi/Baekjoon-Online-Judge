import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		Stack<Integer> stack = new Stack<>();
		
		int idx = 1;
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			if(arr[i] == idx) {
				idx++;
				continue;
			}
			
			while(!stack.isEmpty() && stack.peek() == idx) {
				stack.pop();
				idx++;
			}
			
			stack.add(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			if(stack.pop() != idx) {
				System.out.println("Sad");
				System.exit(0);
			}
			
			idx++;
		}
		
		System.out.println("Nice");
	}
}
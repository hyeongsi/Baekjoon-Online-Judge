import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		String str = "";
		while (!(str = br.readLine()).equals(".")) {
			Stack<Character> stack = new Stack<>();

			boolean fail = false;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch == '(' || ch == '[') {
					stack.add(ch);
					
				} else if (ch == ')') {
					if(stack.isEmpty()) {
						fail = true;
						break;
					}
					
					if(stack.pop() != '(') {
						fail = true;
						break;
					}
					
				} else if (ch == ']') {
					if(stack.isEmpty()) {
						fail = true;
						break;
					}
					
					if(stack.pop() != '[') {
						fail = true;
						break;
					}
				}
			}

			if (fail || !stack.isEmpty())
				sb.append("no\n");
			else
				sb.append("yes\n");
		}

		System.out.println(sb);
	}
}

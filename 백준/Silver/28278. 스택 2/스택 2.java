import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		MyStack stack = new MyStack();
		
		StringBuilder sb = new StringBuilder();
		for(int l = 0; l < X; l++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			switch (n) {
			case 1:
				int i = Integer.parseInt(st.nextToken());
				stack.add(i);
				break;
			case 2:
				sb.append(stack.pop()).append('\n');
				break;
			case 3:
				sb.append(stack.size()).append('\n');
				break;
			case 4:
				sb.append(stack.isEmpty() ? '1' : '0').append('\n');
				break;
			case 5:
				sb.append(stack.peek()).append('\n');
				break;
			}
		}
		
		System.out.println(sb);
	}
}

class MyStack{
	private int[] arr = new int[1000000];
	private int idx = -1;
	
	public void add(int n) {
		arr[++idx] = n;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		
		return arr[idx--];
	}
	
	public int size() {
		return idx + 1;
	}
	
	public boolean isEmpty() {
		return (idx == -1) ? true : false;
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		
		return arr[idx];
	}
}
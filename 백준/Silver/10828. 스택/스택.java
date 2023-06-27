import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int loop = Integer.parseInt(br.readLine());
		Stack myStack = new Stack();
		
		for(int i = 0; i < loop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			switch (str) {
				case "push":
					myStack.push(Integer.parseInt(st.nextToken()));
					break;
				case "top":
					sb.append(myStack.top() + "\n");
					break;
				case "size":
					sb.append(myStack.size() + "\n");
					break;
				case "empty":
					sb.append(myStack.empty() + "\n");
					break;
				case "pop":
					sb.append(myStack.pop() + "\n");
					break;
			}
		}	
		System.out.println(sb);
	}	
}

class Stack{
	int size;
	Node firstNode;
	
	void push(int x) {
		firstNode = new Node(x, firstNode);
		this.size++;
	}
	
	int pop() {
		if(size == 0)
			return -1;
		
		int ret = firstNode.value;
		firstNode = firstNode.nextNode;
		this.size--;
		return ret;
	}
	
	int size() {
		return this.size;
	}
	
	int empty() {
		return this.size == 0 ? 1 : 0;
	}
	
	int top() {
		return this.size == 0 ? -1 : firstNode.value;
	}
}

class Node{
	int value;
	Node nextNode;
	
	public Node(int value, Node nextNode) {
		this.value = value;
		this.nextNode = nextNode;
	}
}
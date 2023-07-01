import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Deque{
	class Node{
		private Node nextNode;
		private Node prevNode;
		private int value;
		
		Node(int value){
			this.value = value;
		}
	}
	
	private Node firstNode;
	private Node lastNode;
	private int size;
	
	public void push_front(int value) {
		Node newNode = new Node(value);
		
		if(size == 0) {
			firstNode = newNode;
			lastNode = firstNode;
		}
		else {
			newNode.nextNode = firstNode;
			firstNode.prevNode = newNode;
			firstNode = newNode;
		}
		
		size++;
	}
	public void push_back(int value) {
		Node newNode = new Node(value);
		
		if(size == 0) {
			firstNode = newNode;
			lastNode = firstNode;
		}
		else {
			lastNode.nextNode = newNode;
			newNode.prevNode = lastNode;
			lastNode = newNode;
		}
		
		size++;
	}
	
	public int pop_front() {
		if(size == 0) {
			return -1;
		}
		else {
			int value = firstNode.value;
			firstNode = firstNode.nextNode;
			if(firstNode == null) {
				lastNode = null;
			}
			else {
				firstNode.prevNode = null;				
			}
			
			size--;
			return value;
		}	
	}
	public int pop_back() {
		if(size == 0) {
			return -1;
		}
		else {
			int value = lastNode.value;
			lastNode = lastNode.prevNode;
			if(lastNode == null) {
				firstNode = null;
			}
			else{
				lastNode.nextNode = null;				
			}
			
			size--;
			return value;
		}	
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		return size == 0 ? 1 : 0;
	}
	
	public int front() {
		return size == 0 ? -1 : firstNode.value;
	}
	
	public int back() {
		return size == 0 ? -1 : lastNode.value;
	}
	
	public void print() {
		Node n = firstNode;
		while (n != null) {
			System.out.print(n.value + " ");
			n = n.nextNode;
		}
	}
}

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Deque dq = new Deque();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		try {
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				switch (st.nextToken()) {
				case "push_front":
					dq.push_front(Integer.parseInt(st.nextToken()));
					break;
				case "push_back":
					dq.push_back(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front":
					bw.write(dq.pop_front() + "\n");
					break;
				case "pop_back":
					bw.write(dq.pop_back() + "\n");
					break;
				case "size":
					bw.write(dq.size() + "\n");
					break;
				case "empty":
					bw.write(dq.empty() + "\n");
					break;
				case "front":
					bw.write(dq.front() + "\n");
					break;
				case "back":
					bw.write(dq.back() + "\n");
					break;
				}
			}
		} catch (Exception e) {
			
		}
		
		
		bw.flush();
		bw.close();
	}		
}
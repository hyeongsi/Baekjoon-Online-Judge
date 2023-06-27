import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] graph;
	
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// 정점의 개수
		int m = Integer.parseInt(st.nextToken());	// 간선의 개수
		int v = Integer.parseInt(st.nextToken());	// 탐색을 시작할 정점의 번호
		
		visited = new boolean[n+1];
		graph = new ArrayList[n+1];
		for(int i = 0; i < n+1; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			graph[x].add(y);
			graph[y].add(x);
		}

		for(int i = 1; i < graph.length; i++) {
			Collections.sort(graph[i]);
		}
		
		dfs(v);
		System.out.println();
		
		visited = new boolean[n+1];
		bfs(v);
	}

	private static void bfs(int x) {
		Queue<Integer> q = new LinkedList<>();
		visited[x] = true;
		q.add(x);
		
		while (!q.isEmpty()) {
			x = q.poll();
			System.out.print(x + " ");
			
			for(int i = 0; i < graph[x].size(); i++) {
				int y = graph[x].get(i);
				if(!visited[y]) {
					visited[y] = true;
					q.add(y);					
				}
			}
		}
	}

	private static void dfs(int x) {
		visited[x] = true;
		System.out.print(x + " ");
		
		for(int i = 0; i < graph[x].size(); i++) {
			int y = graph[x].get(i);
			if(!visited[y]) {
				dfs(y);
			}
		}
	}			
}	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[][] arr;
	static boolean[] visit;
	static int Min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visit = new boolean[N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		combi(0,0);
		System.out.println(Min);
	}
	
	public static void combi(int deep, int idx) {
		if(deep == N/2) {
			diff();
			return;
		}
		
		for(int i = idx; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				combi(deep+1, i+1);				
				visit[i] = false;
			}
		}
	}
	
	public static void diff() {
		int team_start = 0;
		int team_link = 0;
		
		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(visit[i] == true && visit[j] == true) {
					team_start += arr[i][j];
					team_start += arr[j][i];
				}
				else if(visit[i] == false && visit[j] == false) {
					team_link += arr[i][j];
					team_link += arr[j][i];
				}
			}
		}
		
		int val = Math.abs(team_start - team_link);
		
		if(val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		Min = Math.min(Min, val);
		
	}
}
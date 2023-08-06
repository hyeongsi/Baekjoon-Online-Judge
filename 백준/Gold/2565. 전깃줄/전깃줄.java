import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int N = Integer.parseInt(br.readLine());	
		TreeSet<Pos> set = new TreeSet<>(new Comparator<Pos>() {
			@Override
			public int compare(Pos o1, Pos o2) {		
				return o1.y - o2.y;
			}
		});
		
		for(int l = 0; l < N; l++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			set.add(new Pos(n, m));
		}
		
		ArrayList<Pos> list = new ArrayList<>(set);
		int[] dp = new int[set.size()];		
		
		int max = 0;
		for(int i = 0; i < list.size(); i++) {
			for(int j = i-1; j >=0; j--) {
				if(list.get(i).x > list.get(j).x) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
			
			if(dp[i] == 0) dp[i] = 1;
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(list.size() - max);
	}
}

class Pos{
	public int x;
	public int y;
	
	public Pos() {};
	public Pos(int x, int y) {
		this.x = x; this.y = y;
	};
}
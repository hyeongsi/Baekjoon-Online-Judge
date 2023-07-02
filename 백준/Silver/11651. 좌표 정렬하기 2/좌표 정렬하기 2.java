import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] pos = new int[n][2];
		
		for(int i = 0; i < n; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			pos[i][0] = Integer.parseInt(st.nextToken());
			pos[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(pos, (e1, e2)->{
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			}
			
			return e1[1] - e2[1];
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(pos[i][0] + " " + pos[i][1]);
		}
	}	
}
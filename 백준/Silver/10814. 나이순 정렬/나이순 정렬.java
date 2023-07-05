import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] name = new String[n];
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = i;
			name[i] = st.nextToken();
		}
		
		Arrays.sort(arr, (o1, o2)->{
			if(o1[0] == o2[0]) {
				return o1[1]- o2[1];
			}
			
			return o1[0] - o2[0];
		});
		
		StringBuilder sb = new StringBuilder();
		for(int[] i: arr) {
			sb.append(i[0]).append(' ').append(name[i[1]]).append('\n');
		}
		
		System.out.println(sb);
	}
}
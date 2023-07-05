import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Pos[] p = new Pos[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			p[i] = new Pos();
			p[i].value = Integer.parseInt(st.nextToken());
			p[i].index = i;
		}
		
		Arrays.sort(p, (o1, o2)->{
			return o1.value - o2.value;
		});
		
		int max = Integer.MIN_VALUE;
		int cp = -1;
		for(int i = 0; i < n; i++) {
			if(max < p[i].value) {
				max = p[i].value;
				cp++;
			}
			
			p[i].compress = cp;
		}
		
		Arrays.sort(p, (o1, o2)->{
			return o1.index - o2.index;
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(p[i].compress + " ");
		}
		
		System.out.println(sb);
	}
}

class Pos{
	int value;
	int index;
	int compress;
}
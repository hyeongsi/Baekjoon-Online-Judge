import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int morning = Integer.parseInt(st.nextToken());
		int night = Integer.parseInt(st.nextToken());
		int tree = Integer.parseInt(st.nextToken());
		
		int day = (tree - night) / (morning - night);
		
		if((tree - night) % (morning - night) != 0)
			day++;
		
		System.out.println(day);
	}
}
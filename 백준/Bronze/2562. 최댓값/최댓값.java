import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.MIN_VALUE;
		int index = 1;
		
		int cmp;
		for(int i = 1; i <= 9; i++) {
			cmp = Integer.parseInt(br.readLine());
			if(max < cmp) {
				max = cmp;
				index = i;
			}
		}

		System.out.println(max + "\n" + index);
	}
}
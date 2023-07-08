import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());
		
		int[] tree = new int[loop];
		ArrayList<Integer> distanceArr = new ArrayList<>();
		
		for(int i = 0; i < loop; i++) {
			tree[i] = Integer.parseInt(br.readLine());
			
			if(i != 0) {
				distanceArr.add(tree[i] - tree[i-1]);
			}	
		}
		
		
		int g = distanceArr.get(0);
		for(int i = 0; i < distanceArr.size()-1; i++) {
			g = gcd(g, distanceArr.get(i+1));
		}
		
		int end = tree[loop-1] - tree[0];
		System.out.println(end / g + 1 - loop);
	}

	public static int gcd(int a, int b) {
		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}

		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}
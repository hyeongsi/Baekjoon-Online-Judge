import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, Integer> mX = new HashMap<>();
		HashMap<Integer, Integer> mY = new HashMap<>();
		
		int x,y;
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			if(mX.containsKey(x))
				mX.put(x, mX.get(x)+1);
			else
				mX.put(x, 1);
			
			if(mY.containsKey(y))
				mY.put(y, mY.get(y)+1);
			else
				mY.put(y, 1);
		}
		
		for (Integer i : mX.keySet()) {
			if(mX.get(i) == 1) {
				System.out.print(i);
				break;
			}
		}
		
		for (Integer i : mY.keySet()) {
			if(mY.get(i) == 1) {
				System.out.print(" " + i);
				break;
			}
		}
	}
}
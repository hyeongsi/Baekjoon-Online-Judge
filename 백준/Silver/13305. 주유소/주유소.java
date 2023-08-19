import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long[] distances = new long[N-1];
		long[] oilPrices = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N-1; i++) {
			distances[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			oilPrices[i] = Long.parseLong(st.nextToken());
		}
		
		long price = 0;
		long minOilPrice = Long.MAX_VALUE;
		for(int i = 0; i < N-1; i++) {
			if(oilPrices[i] < minOilPrice) {
				minOilPrice = oilPrices[i];
			}
			
			price += minOilPrice * distances[i];
		}
		
		System.out.println(price);
	}
}

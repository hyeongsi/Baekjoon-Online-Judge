import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = m; i <= n; i++) {
			if(isPrime(i))
				al.add(i);
		}
		
		int sum = 0;
		if(al.size() == 0)
			System.out.println(-1);
		else{
			for(int p:al)
				sum += p;
			
			System.out.println(sum);
			System.out.println(al.get(0));
		}
	}

	private static boolean isPrime(int n) {
		if(n == 1)
			return false;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}
		
		return true;
	}
}
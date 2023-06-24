import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		if(n == 1)
			return;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		while(!isPrime(n)) {
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					al.add(i);
					n /= i;
					break;
				}	
			}
		}
		
		al.add(n);
		Collections.sort(al);
		
		for(int l:al)
			System.out.println(l);
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
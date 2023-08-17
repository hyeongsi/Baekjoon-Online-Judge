import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static Fibo[] dp = new Fibo[41];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		dp[0] = new Fibo(1,0);
		dp[1] = new Fibo(0,1);
		
		for(int i = 2; i < dp.length; i++) {
			dp[i] = Fibo.sum(dp[i-1], dp[i-2]); 
		}
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			Fibo f = dp[N];
			sb.append(f.zero + " " + f.one + "\n");
		}
		
		System.out.println(sb);
	}

}

class Fibo{
	public int zero;
	public int one;
	
	public Fibo() {}
	public Fibo(int zero, int one) {
		this.zero = zero;
		this.one = one;
	}
	
	public static Fibo sum(Fibo o1, Fibo o2) {
		Fibo f = new Fibo();
		f.zero = o1.zero + o2.zero;
		f.one = o1.one + o2.one;
		
		return f;
	}
}

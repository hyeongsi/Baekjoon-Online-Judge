import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int f[];
	static int cnt;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		f = new int[n];
		
		cnt = 0;
		fib(n);
		System.out.println(cnt+1);
		
		cnt = 0;
		fibonacci(n);
		System.out.println(cnt);
	}
	
	static int fib(int n) {
	    if (n == 1 || n == 2) {
	    		return 1;
	    }
	    else {
	    		cnt++;
	    		return (fib(n - 1) + fib(n - 2));
	    }
	}
	
	static int fibonacci(int n) {
	    f[0] = f[1] = 1;
	    for (int i = 2; i < n; i++) {
	    		cnt++;
	    		f[i] = f[i - 1] + f[i - 2];	    	
	    }
	    return f[n-1];
	}
}

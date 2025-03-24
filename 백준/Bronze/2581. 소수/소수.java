import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[10001];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(10000); i++) {

            if (prime[i]) continue;

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        int result = 0;
        int minPrime = Integer.MAX_VALUE;
        for (int i = m; i <= n; i++) {
            if (!prime[i])  {
                minPrime = Math.min(minPrime, i);
                result += i;
            }
        }

        if (result == 0) {
            System.out.println(-1);
        } else {
            System.out.println(result);
            System.out.println(minPrime);
        }
    }
}
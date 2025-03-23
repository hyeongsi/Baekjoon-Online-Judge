import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        boolean[] prime = new boolean[1001];
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(1000); i++) {

            if (prime[i] == true) continue;

            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!prime[Integer.parseInt(nums[i])]) result ++;
        }

        System.out.println(result);
    }
}
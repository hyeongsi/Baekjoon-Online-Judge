import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(n);
            return;
        }

        int loop = 2;
        int[] range = {2, 7};
        int acc = 5;
        while (true) {
            if (range[0] <= n && n <= range[1]) {
                break;
            }

            loop++;
            acc += 6;
            range[0] = range[1] + 1;
            range[1] = range[0] + acc;
        }

        System.out.println(loop);
    }

}
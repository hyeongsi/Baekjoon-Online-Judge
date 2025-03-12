import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        int sum = 2;
        for (int j = 0; j < i; j++) {
            sum += Math.pow(2, j);
        }
        System.out.println(sum * sum);

    }

}
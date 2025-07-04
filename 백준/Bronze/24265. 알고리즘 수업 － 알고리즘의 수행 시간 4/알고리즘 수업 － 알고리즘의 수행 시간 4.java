import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long i = Long.parseLong(br.readLine());
        
        long sum = 0;
        for (int j = 1; j < i; j++) {
            sum += j;
        }

        System.out.println(sum);
        System.out.println(2);
    }
}


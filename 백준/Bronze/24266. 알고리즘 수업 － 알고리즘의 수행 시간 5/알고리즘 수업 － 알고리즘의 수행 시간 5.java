import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long i = Long.parseLong(br.readLine());

        System.out.println(i*i*i);
        System.out.println(3);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        final int a = Integer.parseInt(inputs[0]);
        final int b = Integer.parseInt(inputs[1]);
        final int c = Integer.parseInt(inputs[2]);

        System.out.println((int)(Math.ceil((double)(c - a) / (a - b)) + 1));
    }
}
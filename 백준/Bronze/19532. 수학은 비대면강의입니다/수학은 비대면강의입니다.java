import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if ((input[0] * x) + (input[1] * y) == input[2] && (input[3] * x) + (input[4] * y) == input[5]) {
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }

    }
}
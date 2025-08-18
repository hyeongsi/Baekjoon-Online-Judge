import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine().split(" ")[1]);
        Integer[] scores = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);

        Arrays.sort(scores, Collections.reverseOrder());
        System.out.println(scores[k - 1]);
    }
}
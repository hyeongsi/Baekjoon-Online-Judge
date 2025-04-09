import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int min = Integer.MAX_VALUE;
        min = Math.min(min, array[0]);
        min = Math.min(min, Math.abs(array[0] - array[2]));
        min = Math.min(min, array[1]);
        min = Math.min(min, Math.abs(array[1] - array[3]));

        System.out.println(min);
    }
}
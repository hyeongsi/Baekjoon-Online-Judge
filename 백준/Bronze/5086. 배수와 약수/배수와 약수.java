import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while (true) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (array[0] == 0 && array[1] == 0) break;

            if (array[0] % array[1] == 0) {
                sb.append("multiple\n");
            } else if (array[1] % array[0] == 0) {
                sb.append("factor\n");
            } else {
                sb.append("neither\n");
            }
        }

        System.out.println(sb);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[n][m];

        for (int i = 0; i < 2; i++) {
            for (int y = 0; y < n; y++) {
                int[] array = getIntArrToString(br.readLine());
                sumArrayElement(matrix[y], array);
            }
        }

        for (int[] line : matrix) {
            for (int e : line) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    public static int[] getIntArrToString(String str) {
        return Arrays.stream(str.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void sumArrayElement(int[] a, int[] b) {
        IntStream.range(0, Math.min(a.length, b.length))
                .forEach(i -> a[i] += b[i]);
    }
}
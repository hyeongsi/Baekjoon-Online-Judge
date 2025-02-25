import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int N = Integer.parseInt(st.nextToken()); // 바구니 수
        final int M = Integer.parseInt(st.nextToken()); // 반복 수

        final int[] baskets = new int[N];
        Arrays.setAll(baskets, i -> i + 1);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());

            while(i1 < i2) {
                reverseBasketIndex(baskets, i1, i2);
                i1++;
                i2--;
            }
        }

        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
    }

    static void reverseBasketIndex(int[] baskets, int i, int j) {
        int temp = baskets[i - 1];
        baskets[i - 1] = baskets[j - 1];
        baskets[j - 1] = temp;
    }
}
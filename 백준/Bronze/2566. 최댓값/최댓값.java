import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static final int SIZE = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MaxPos maxPos = new MaxPos();
        for (int i = 0; i < SIZE; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < SIZE; j++) {
                if (maxPos.max >= array[j])
                    continue;

                maxPos.max = array[j];
                maxPos.y = i;
                maxPos.x = j;
            }
        }

        System.out.println(maxPos);
    }

    static class MaxPos {
        public int y = 0;
        public int x = 0;
        public int max = 0;

        @Override
        public String toString() {
            return max + "\n" + (y + 1) + " " + (x + 1);
        }
    }
}
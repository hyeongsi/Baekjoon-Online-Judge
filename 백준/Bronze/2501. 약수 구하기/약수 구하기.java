import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 1; i <= (int)Math.sqrt(inputs[0]); i++) {
            if (inputs[0] % i == 0) {
                treeSet.add(i);
                treeSet.add(inputs[0] / i);
            }
        }
        if (treeSet.size() < inputs[1]) {
            System.out.println(0);
        } else {
            for (int i = 0; i < inputs[1] - 1; i++) {
                treeSet.pollFirst();
            }
            System.out.println(treeSet.pollFirst());
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> sides = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).sorted().collect(Collectors.toList());

        if (sides.get(0) + sides.get(1) <= sides.get(2)) {
            System.out.println((sides.get(0) + sides.get(1)) * 2 - 1);
        } else {
            System.out.println(sides.get(0) + sides.get(1) + sides.get(2));
        }

    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split("");
        List<String> list = Arrays.asList(split);

        Collections.sort(list);
        Collections.reverse(list);

        list.forEach(System.out::print);
    }
}
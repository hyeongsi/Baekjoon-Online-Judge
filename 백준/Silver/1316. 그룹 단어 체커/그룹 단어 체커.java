import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        int dupCnt = 0;
        for (int i = 0; i < loop; i++) {
            String[] input = br.readLine().split("");

            Map<String, Boolean> hashMap = new HashMap<>();
            String prev = input[0];

            for (int j = 0; j < input.length; j++) {
                String key = input[j];

                if (!hashMap.containsKey(key)) {
                    hashMap.put(key, true);
                } else if (!prev.equals(key)) {
                    dupCnt++;
                    break;
                }

                prev = key;
            }
        }

        System.out.println(loop - dupCnt);
    }
}
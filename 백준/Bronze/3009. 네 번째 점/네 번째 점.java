import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> mapX = new HashMap<>();
        Map<String, Integer> mapY = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            String[] dots = br.readLine().split(" ");
            mapX.put(dots[0], mapX.containsKey(dots[0]) ? mapX.get(dots[0]) + 1 : 1 );
            mapY.put(dots[1], mapY.containsKey(dots[1]) ? mapY.get(dots[1]) + 1 : 1 );
        }

        StringBuilder sb = new StringBuilder();
        for (String s : mapX.keySet()) {
            if (mapX.get(s) == 1) {
                sb.append(s).append(" ");
                break;
            }
        }
        for (String s : mapY.keySet()) {
            if (mapY.get(s) == 1) {
                sb.append(s);
                break;
            }
        }

        System.out.println(sb);
    }
}
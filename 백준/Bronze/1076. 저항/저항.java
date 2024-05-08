import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        HashMap<String, int[]> map = new HashMap<>();
        for (int i = 0; i < color.length; i ++) {
            map.put(color[i], new int[]{i, (int) Math.pow(10, i)});
        }

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        StringBuilder sb = new StringBuilder();
        sb.append(map.get(first)[0]);
        sb.append(map.get(second)[0]);
        
        Long ans = Long.parseLong(sb.toString()) * map.get(third)[1];
        System.out.println(ans);
    }// end main

}


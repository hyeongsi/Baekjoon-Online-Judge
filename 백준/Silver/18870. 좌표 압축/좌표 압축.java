import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] orgNum = new int [n];
        int[] sortedNum = new int[n];
        Map<Integer, Integer> rankMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            orgNum[i] = Integer.parseInt(st.nextToken());
            sortedNum[i] = orgNum[i];
        }

        Arrays.sort(sortedNum);

        int rank = 0;
        for (int num : sortedNum) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        for (int num : orgNum) {
            bw.write(rankMap.get(num) + " ");
        }

        bw.flush();
        bw.close();
    }
}
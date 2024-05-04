import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer testCase = Integer.parseInt(br.readLine());

        // start, end
        double[][] point = new double[2][2];

        for (int i = 0; i < testCase; i++) {
            int answer = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                point[j][0] = Double.parseDouble(st.nextToken()); // x
                point[j][1] = Double.parseDouble(st.nextToken()); // y
            }

            Integer planetCnt = Integer.parseInt(br.readLine());
            double[][] planet = new double[planetCnt][3];
            for (int j = 0; j < planetCnt; j++) {
                st = new StringTokenizer(br.readLine());
                planet[j][0] = Double.parseDouble(st.nextToken()); // x
                planet[j][1] = Double.parseDouble(st.nextToken()); // y
                planet[j][2] = Double.parseDouble(st.nextToken()); // r

                // 문제 풀이
                boolean[] isInside = new boolean[2];
                for (int k = 0; k < 2; k++) {
                    double x = point[k][0] - planet[j][0];
                    double y = point[k][1] - planet[j][1];

                    double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
                    if (distance < planet[j][2]) {
                        isInside[k] = true;
                    }
                }

                answer = (isInside[0] ^ isInside[1]) ? answer + 1 : answer;
            }

            System.out.println(answer);
        }

    }// end main
}


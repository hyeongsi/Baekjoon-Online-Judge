import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        String[] line;

        for (int i = 0; i < 8; i++) {
            line = br.readLine().split("");
            for (int j = 0; j < 8; j+=2) {
                String piece;
                if (i % 2 == 1) {
                    piece = line[j + 1];
                } else {
                    piece = line[j];
                }
                answer = piece.equals("F") ? answer + 1 : answer;
            }
        }

        System.out.println(answer);

    }// end main

}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] ans = new int[3];  // -1, 0, 1
    static int[][] paper;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        // 종이 입력받고
        paper = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 나누고
        divide(0,0,N);

        // 답 출력
        for (int i = 0; i < 3; i++) {
            System.out.println(ans[i]);
        }

    } // end main

    static void divide(int y, int x, int n){

        int startNum = paper[y][x];
        if(n == 1){
            ansCnt(startNum);
            return;
        }

        int divValue = n/3;

        for (int i = y; i < y+n; i++) {
            for (int j = x; j < x+n; j++) {
                if(startNum == paper[i][j]) {
                    continue;
                }

                slice(y,x,divValue);
                return;
            }
        }

        ansCnt(startNum);
    }

    static void ansCnt(int startNum){
        ans[startNum+1]++;
    }

    static void slice(int y, int x, int divValue){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divide(y+(i*divValue),x+(j * divValue),divValue);
            }
        }

    }
}

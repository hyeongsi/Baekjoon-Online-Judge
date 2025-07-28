import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        List<Long> titleList = new ArrayList<>();

        long loopCnt = 0;
        while (i != titleList.size()) {
            if (-1 != Long.toString(loopCnt).indexOf("666")) {
                titleList.add(loopCnt);
            }
            loopCnt++;
        }

        System.out.println(titleList.get(i - 1));
    }
}
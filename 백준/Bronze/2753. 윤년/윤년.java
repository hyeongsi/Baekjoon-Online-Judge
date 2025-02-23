import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());
        LocalDate date = LocalDate.of(year, Month.FEBRUARY, 1);
        System.out.println(date.isLeapYear() ? 1 : 0);
    }
}

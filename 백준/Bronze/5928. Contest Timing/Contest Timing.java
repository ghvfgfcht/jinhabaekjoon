import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int D = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int M = Integer.parseInt(input[2]);

        int startDay = 11;
        int startHour = 11;
        int startMinute = 11;

        int startTimeInMinutes = (startDay * 24 * 60) + (startHour * 60) + startMinute;

        int endTimeInMinutes = (D * 24 * 60) + (H * 60) + M;

        int totalMinutesSpent = endTimeInMinutes - startTimeInMinutes;

        if (totalMinutesSpent < 0) {
            System.out.println(-1);
        } else {
            System.out.println(totalMinutesSpent);
        }
    }
}
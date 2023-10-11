import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 시각 입력
        int currentHour = sc.nextInt();
        int currentMinute = sc.nextInt();
        int currentSecond = sc.nextInt();

        // 요리 시간 입력 (초)
        int cookTime = sc.nextInt();

        // 총 요리 시간 계산
        int totalSeconds = currentHour * 3600 + currentMinute * 60 + currentSecond + cookTime;

        // 시, 분, 초 계산
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // 24시간 형식에 맞게 출력
        hours %= 24;

        System.out.println(hours + " " + minutes + " " + seconds);
    }
}

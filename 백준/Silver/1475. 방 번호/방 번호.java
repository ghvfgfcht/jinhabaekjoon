import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomNumber = scanner.nextLine();
        scanner.close();

        int[] counts = new int[10]; 

        for (int i = 0; i < roomNumber.length(); i++) {
            int digit = Character.getNumericValue(roomNumber.charAt(i));
            counts[digit]++;
        }

        int totalSets = (counts[6] + counts[9] + 1) / 2;

        for (int i = 0; i <= 9; i++) {
            if (i != 6 && i != 9) {
                totalSets = Math.max(totalSets, counts[i]);
            }
        }

        System.out.println(totalSets);
    }
}
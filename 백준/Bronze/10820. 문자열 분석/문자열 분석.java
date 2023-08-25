import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static int upperCase;
    static int lowerCase;
    static int space;
    static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = br.readLine()) != null) {
            upperCase = 0;
            lowerCase = 0;
            space = 0;
            num = 0;
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (Character.isUpperCase(ch)) {
                    upperCase++;
                } else if (Character.isLowerCase(ch)) {
                    lowerCase++;
                } else if (Character.isDigit(ch)) {
                    num++;
                } else if (ch == ' ') {
                    space++;
                }
            }
            bw.write(lowerCase + " " + upperCase + " " + num + " " + space + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
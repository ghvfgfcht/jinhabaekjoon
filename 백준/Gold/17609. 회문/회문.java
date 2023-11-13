import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean isPalin(String line, int left, int right){
        while(left<right){
            if(line.charAt(left)!=line.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    static boolean isSimilarPalin(String line) {
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                int j = line.length() - 1 - i;
                return isPalin(line, i + 1, j) || isPalin(line, i, j - 1);
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        String line;
        for(int i=0;i<testCase;i++){
            line=br.readLine();
            if(isPalin(line, 0, line.length()-1) && !isSimilarPalin(line)){
                sb.append("0\n");
            }
            else if(!isPalin(line, 0, line.length()-1) && isSimilarPalin(line)){
                sb.append("1\n");
            }
            else if(!isPalin(line, 0, line.length()-1) && !isSimilarPalin(line)){
                sb.append("2\n");
            }
        }
        System.out.println(sb);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int testCase=Integer.parseInt(br.readLine());
        for(int i=0;i<testCase;i++){
            int tmp=Integer.parseInt(br.readLine());
            String result="";
            while(tmp!=0){
                int tem=tmp%2;
                result+=String.valueOf(tem);
                tmp/=2;
            }
            for(int j=0;j<result.length();j++){
                if(result.charAt(j)=='1'){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
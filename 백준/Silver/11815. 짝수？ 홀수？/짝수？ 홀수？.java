import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean isSqrt(long num){
        long sqrt=(long) Math.sqrt(num);
        return sqrt*sqrt==num;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=0;i<n;i++){
            long num=Long.parseLong(st.nextToken());
            if(isSqrt(num)){
                sb.append("1 ");
            }
            else{
                sb.append("0 ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
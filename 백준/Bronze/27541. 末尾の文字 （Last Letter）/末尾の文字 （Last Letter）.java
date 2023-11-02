import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String string=br.readLine();
        if(string.charAt(n-1)=='G'){
            System.out.println(string.substring(0,n-1));
        }
        else{
            string+='G';
            System.out.println(string);
        }
    }
}
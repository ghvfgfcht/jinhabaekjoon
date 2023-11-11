import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int num=Integer.parseInt(br.readLine());
        while(true) {
        	int tmp=Integer.parseInt(br.readLine());
        	if(tmp==0) {
        		break;
        	}
        	if(tmp%num==0) {
        		System.out.println(tmp+" is a multiple of "+num+".");
        	}
        	else {
        		System.out.println(tmp+" is NOT a multiple of "+num+".");
        	}
        }
    }
}
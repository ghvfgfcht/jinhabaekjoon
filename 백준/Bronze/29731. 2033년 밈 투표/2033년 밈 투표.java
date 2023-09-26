import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n=Integer.parseInt(br.readLine());
        int cnt=0;
        for(int i=0;i<n;i++) {
        	String line=br.readLine();
        	switch(line) {
        	case"Never gonna give you up":{
        		cnt++;
        		break;
        	}
        	case"Never gonna let you down":{
        		cnt++;
        		break;
        	}
        	case"Never gonna run around and desert you":{
        		cnt++;
        		break;
        	}
        	case"Never gonna make you cry":{
        		cnt++;
        		break;
        	}
        	case"Never gonna say goodbye":{
        		cnt++;
        		break;
        	}
        	case"Never gonna tell a lie and hurt you":{
        		cnt++;
        		break;
        	}
        	case"Never gonna stop":{
        		cnt++;
        		break;
        	}
        	default:{
        		break;
        	}
        	}
        }
    	if(cnt==n) {
    		bw.write("No\n");
    	}
    	else {
    		bw.write("Yes\n");
    	}
    	bw.flush();
    	bw.close();
    	br.close();
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      long n=Long.parseLong(br.readLine());
      long len=0;
      for(int i=1;i<=n;i++) {
    	  if(i<10) {
    		  len++;
    	  }
    	  else if(i>=10&&i<100) {
    		  len+=2;
    	  }
    	  else if(i>=100&&i<1000) {
    		  len+=3;
    	  }
    	  else if(i>=1000&&i<10000) {
    		  len+=4;
    	  }
    	  else if(i>=10000&&i<100000) {
    		  len+=5;
    	  }
    	  else if(i>=100000&&i<1000000) {
    		  len+=6;
    	  }
    	  else if(i>=1000000&&i<10000000) {
    		  len+=7;
    	  }
    	  else if(i>=10000000&&i<100000000) {
    		  len+=8;
    	  }
    	  else if(i>=100000000) {
    		  len+=9;
    	  }
      }
      bw.write(len+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}
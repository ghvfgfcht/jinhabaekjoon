import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      while(true) {
    	  String line=br.readLine();
    	  if(line.equals("TTYL")) {
    		  bw.write("talk to you later\n");
    		  break;
    	  }
    	  switch(line) {
    	  case "CU":{
    		  bw.write("see you\n");
    		  break;
    	  }
    	  case ":-)":{
    		  bw.write("I’m happy\n");
    		  break;
    	  }
    	  case ":-(":{
    		  bw.write("I’m unhappy\n");
    		  break;
    	  }
    	  case ";-)":{
    		  bw.write("wink\n");
    		  break;
    	  }
    	  case ":-P":{
    		  bw.write("stick out my tongue\n");
    		  break;
    	  }
    	  case "(~.~)":{
    		  bw.write("sleepy\n");
    		  break;
    	  }
    	  case "TA":{
    		  bw.write("totally awesome\n");
    		  break;
    	  }
    	  case "CCC":{
    		  bw.write("Canadian Computing Competition\n");
    		  break;
    	  }
    	  case "CUZ":{
    		  bw.write("because\n");
    		  break;
    	  }
    	  case "TY":{
    		  bw.write("thank-you\n");
    		  break;
    	  }
    	  case "YW":{
    		  bw.write("you’re welcome\n");
    		  break;
    	  }
    	  default:{
    		  bw.write(line+"\n");
    		  break;
    	  }
    	  }
      }
      bw.flush();
      bw.close();
      br.close();
    }
}
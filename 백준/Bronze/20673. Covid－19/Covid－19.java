import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      int p=Integer.parseInt(br.readLine()); //신규 환자수
      int q=Integer.parseInt(br.readLine()); //신규 입원 건수
      if(q<=p) {
    	  if(p<=50&&q<=10) {
        	  bw.write("White"+"\n");
          }
          else if(q>30) {
        	  bw.write("Red"+"\n");
          }
          else {
        	  bw.write("Yellow"+"\n");
          }
      }
      bw.flush();
      bw.close();
      br.close();
    }
}
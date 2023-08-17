import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static int stair_size;
	static int stair[];
	static int score[];
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      stair_size=Integer.parseInt(br.readLine());
      stair=new int[stair_size];
      for(int i=0;i<stair_size;i++) {
    	  stair[i]=Integer.parseInt(br.readLine());
      }
      if(stair_size<=2) { //계단이 2개 이하일때
    	  int sum=0;
    	  for(int i=0;i<stair_size;i++) {
    		  sum+=stair[i];
    	  }
    	  bw.write(sum+"\n");
      }
      else { //계단이 3개 이상일때
          score=new int[stair_size];
    	  score[0]=stair[0];
    	  score[1]=stair[0]+stair[1];
    	  score[2]=Math.max(stair[0]+stair[2], stair[1]+stair[2]);
    	  for(int i=3;i<stair_size;i++) {
    		  score[i]=Math.max(score[i-3]+stair[i-1]+stair[i], score[i-2]+stair[i]);
    	  }
          bw.write(score[stair_size-1]+"\n");
      }
      bw.flush();
      bw.close();
      br.close();
    }
}
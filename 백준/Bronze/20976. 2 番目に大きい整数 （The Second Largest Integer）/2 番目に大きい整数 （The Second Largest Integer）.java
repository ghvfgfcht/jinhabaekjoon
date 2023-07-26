import java.io.*;
import java.util.*;

public class Main{ 
	static Integer nlist[];
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st=new StringTokenizer(br.readLine()," ");
      nlist=new Integer[3];
      for(int i=0;i<3;i++) {
    	  nlist[i]=Integer.parseInt(st.nextToken());
      }
      Arrays.sort(nlist);
      bw.write(nlist[1]+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}
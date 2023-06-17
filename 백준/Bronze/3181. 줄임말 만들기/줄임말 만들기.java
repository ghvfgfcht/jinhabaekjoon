import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static String word;
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String order[]=br.readLine().split(" ");
		word="";
		for(int i=0;i<order.length;i++) {
			String tmp=order[i];
			if(i==0) {
				word+=tmp.charAt(0)+"";
			}
			else {
				if(!tmp.equals("i")&&!tmp.equals("pa")&&!tmp.equals("te")&&!tmp.equals("ni")&&!tmp.equals("niti")&&!tmp.equals("a")&&!tmp.equals("ali")&&!tmp.equals("nego")&&!tmp.equals("no")&&!tmp.equals("ili"))
					word+=tmp.charAt(0)+"";
			}
		}
		bw.write(word.toUpperCase()+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
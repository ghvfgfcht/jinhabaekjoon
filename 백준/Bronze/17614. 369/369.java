import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static int clap_cnt(String num) {
		int cnt=0;
		for(int i=0;i<num.length();i++) {
			if(num.charAt(i)=='3'||num.charAt(i)=='6'||num.charAt(i)=='9') {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		String tmp="";
		int total=0;
		for(int i=1;i<=n;i++) {
			tmp=String.valueOf(i);
			total+=clap_cnt(tmp);
		}
		bw.write(total+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
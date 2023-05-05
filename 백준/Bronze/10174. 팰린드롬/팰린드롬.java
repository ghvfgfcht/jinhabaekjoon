import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static boolean isp(String tmp) {
		int lt=0;
		int rt=tmp.length()-1;
		while(lt<rt) {
			if(tmp.charAt(lt)!=tmp.charAt(rt)) {
				return false;
			}
			lt++;
			rt--;
		}
		return true;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String order=br.readLine().toUpperCase();
			if(isp(order)) {
				bw.write("Yes"+"\n");
			}
			else {
				bw.write("No"+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
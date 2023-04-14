import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	static int cnt(String ord) {
		int cnt=0;
		for(int i=0;i<ord.length();i++) {
			if(ord.charAt(i)=='c' && i<ord.length()-1) {
				if(ord.charAt(i+1)=='=') {
					i++;
				}
				else if(ord.charAt(i+1)=='-') {
					i++;
				}
			}
			else if(ord.charAt(i)=='d' && i<ord.length()-1) {
				if(ord.charAt(i+1)=='z') {
					if(i<ord.length()-2) {
						if(ord.charAt(i+2)=='=') {
							i+=2;
						}
					}
				}
				else if(ord.charAt(i+1)=='-'){
					i++;
				}
			}
			else if(ord.charAt(i)=='l' && i<ord.length()-1){
				if(ord.charAt(i+1)=='j') {
					i++;
				}
			}
			else if(ord.charAt(i)=='n' && i<ord.length()-1) {
				if(ord.charAt(i+1)=='j') {
					i++;
				}
			}
			else if(ord.charAt(i)=='s' && i<ord.length()-1) {
				if(ord.charAt(i+1)=='=') {
					i++;
				}
			}
			else if(ord.charAt(i)=='z' && i<ord.length()-1) {
				if(ord.charAt(i+1)=='=') {
					i++;
				}
			}
			cnt++;
		}
		return cnt;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String order=br.readLine();
		int count=cnt(order);
		bw.write(count+"\n");
		bw.flush();
		bw.close(); 
		br.close();
	}
}
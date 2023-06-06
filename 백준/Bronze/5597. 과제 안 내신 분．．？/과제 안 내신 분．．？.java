import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer>arr=new ArrayList<>();
		for(int i=0;i<28;i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		for(int i=1;i<=30;i++) {
			if(!arr.contains(i)) {
				bw.write(i+"\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
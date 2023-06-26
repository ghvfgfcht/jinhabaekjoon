import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main{ 
	static ArrayList<String> arr=new ArrayList<>();
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String line=br.readLine();
		for(int i=0;i<line.length();i++) {
			arr.add(line.charAt(i)+"");
		}
		if(arr.contains("M")&&arr.contains("B")&&arr.contains("O")&&arr.contains("I")&&arr.contains("S")) {
			bw.write("YES"+"\n");
		}
		else {
			bw.write("NO"+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
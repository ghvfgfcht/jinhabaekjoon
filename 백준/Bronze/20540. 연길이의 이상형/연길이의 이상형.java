import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String mbti[]=br.readLine().split("");
		String result="";
		for(int i=0;i<mbti.length;i++) {
			String tmp=mbti[i];
			switch(tmp) {
			case "E": result+="I"; break;
			case "I": result+="E";break;
			case "N": result+="S";break;
			case "S": result+="N";break;
			case "F": result+="T";break;
			case "T": result+="F";break;
			case "P": result+="J";break;
			case "J": result+="P";break;
			}
		}
		bw.write(result+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
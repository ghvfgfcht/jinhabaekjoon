import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String score=br.readLine();
		switch(score) {
		case "A+":{
			bw.write("4.3"+"\n");
			break;
		}
		case "A0":{
			bw.write("4.0"+"\n");
			break;
		}
		case "A-":{
			bw.write("3.7"+"\n");
			break;
		}
		case "B+":{
			bw.write("3.3"+"\n");
			break;
		}
		case "B0":{
			bw.write("3.0"+"\n");
			break;
		}
		case "B-":{
			bw.write("2.7"+"\n");
			break;
		}case "C+":{
			bw.write("2.3"+"\n");
			break;
		}
		case "C0":{
			bw.write("2.0"+"\n");
			break;
		}
		case "C-":{
			bw.write("1.7"+"\n");
			break;
		}
		case "D+":{
			bw.write("1.3"+"\n");
			break;
		}
		case "D0":{
			bw.write("1.0"+"\n");
			break;
		}
		case "D-":{
			bw.write("0.7"+"\n");
			break;
		}
		case "F":{
			bw.write("0.0"+"\n");
			break;
		}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
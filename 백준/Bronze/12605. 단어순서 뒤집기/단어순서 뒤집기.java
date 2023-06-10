import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{ 
	static Stack<String>stack=new Stack<String>();
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			while(st.hasMoreTokens()) {
				stack.push(st.nextToken());
			}
			bw.write("Case #"+(i+1)+": ");
			while(!stack.isEmpty()) {
				bw.write(stack.pop()+" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
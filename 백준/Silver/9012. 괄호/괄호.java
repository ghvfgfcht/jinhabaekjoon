import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{ 
	static Stack<String>stack=new Stack<String>();
	static int isVPS(String arr[]) {
		for(int i=0;i<arr.length;i++) {
			String tmp=arr[i];
			if(tmp.equals("(")) {
				stack.push(tmp);
			}
			else {
				if(!stack.isEmpty()) {
					stack.pop();
				}
				else {
					return 0;
				}
			}
		}
		if(stack.isEmpty()) {return 1;}
		else {return 0;}
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String line[]=br.readLine().split("");
			if(isVPS(line)==1) {
				bw.write("YES"+"\n");
			}
			else {
				bw.write("NO"+"\n");
			}
			stack.clear();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
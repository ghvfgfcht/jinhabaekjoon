import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{ 
	static long postfix(char line[]) {
		Stack<Long>stack=new Stack<>();
		long op1=0;
		long op2=0;
		for(int i=0;i<line.length;i++) {
			char tmp=line[i];
			if(tmp!='+'&&tmp!='-'&&tmp!='*'&&tmp!='/') {
				stack.push((long)tmp-'0');
			}
			else {
				op2=stack.pop();
				op1=stack.pop();
				switch(tmp) {
				case '+':{
					stack.push(op1+op2);
					break;
				}
				case '-':{
					stack.push(op1-op2);
					break;
				}
				case '*':{
					stack.push(op1*op2);
					break;
				}
				case '/':{
					stack.push(op1/op2);
					break;
				}
				}
			}
		}
		return stack.pop();
	}
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      char line[]=br.readLine().toCharArray();
      bw.write(postfix(line)+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}
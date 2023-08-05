import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{ 
	static Stack<Character>stack=new Stack<>();
	static int priority(char operator) {
		int pr=0;
		if(operator=='*'||operator=='/') {
			pr=2;
		}
		else if(operator=='+'||operator=='-') {
			pr=1;
		}
		else if(operator==')'||operator=='(') {
			pr=0;
		}
		return pr;
	}
	static String inf_to_postf(char line[]) {
		String result="";
		char top;
		char tem;
		for(int i=0;i<line.length;i++) {
			tem=line[i];
			switch(tem) {
			case '+': case '-': case '*': case '/':{
				while(!stack.isEmpty()&&priority(tem)<=priority(stack.peek())) {
					result+=stack.pop();
				}
				stack.push(tem);
				break;
			}
			case '(':{
				stack.push(tem);
				break;
			}
			case ')':{
				top=stack.pop();
				while(top!='(') {
					result+=top;
					top=stack.pop();
				}
				break;
			}
			default:{
				result+=tem;
				break;
			}
			}
		}
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		return result;
	}
    public static void main(String[]args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      char line[]=br.readLine().toCharArray();
      bw.write(inf_to_postf(line)+"\n");
      bw.flush();
      bw.close();
      br.close();
    }
}
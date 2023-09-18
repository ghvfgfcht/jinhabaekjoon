import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main{ 
	static Deque<Integer>dq=new ArrayDeque<>();
	static int n;
    public static void main(String[] args) throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    	n=Integer.parseInt(br.readLine());
    	String op="";
    	int num=0;
    	for(int i=0;i<n;i++) {
    		StringTokenizer st=new StringTokenizer(br.readLine()," ");
    		if(st.countTokens()>=2) {
    			op=st.nextToken();
    			num=Integer.parseInt(st.nextToken());
    		}
    		else {
    			op=st.nextToken();
    		}
    		switch(op) {
    		case "1":{
    			dq.offerFirst(num);
    			break;
    		}
    		case "2":{
    			dq.offerLast(num);
    			break;
    		}
    		case "3":{
    			if(!dq.isEmpty()) {
    				bw.write(dq.pollFirst()+"\n");
    			}
    			else {
    				bw.write("-1\n");
    			}
    			break;
    		}
    		case "4":{
    			if(!dq.isEmpty()) {
    				bw.write(dq.pollLast()+"\n");
    			}
    			else {
    				bw.write("-1\n");
    			}
    			break;
    		}
    		case "5":{
    			bw.write(dq.size()+"\n");
    			break;
    		}
    		case "6":{
    			if(dq.isEmpty()) {
    				bw.write("1\n");
    			}
    			else {
    				bw.write("0\n");
    			}
    			break;
    		}
    		case "7":{
    			if(!dq.isEmpty()) {
    				bw.write(dq.peekFirst()+"\n");
    			}
    			else {
    				bw.write("-1\n");
    			}
    			break;
    		}
    		case "8":{
    			if(!dq.isEmpty()) {
    				bw.write(dq.peekLast()+"\n");
    			}
    			else {
    				bw.write("-1\n");
    			}
    			break;
    		}
    		}
    	}
    	bw.flush();
    	bw.close();
    	br.close();
     }
}
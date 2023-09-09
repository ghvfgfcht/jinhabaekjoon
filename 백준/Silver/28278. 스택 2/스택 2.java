import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	static Stack<Integer>stack=new Stack<>();
    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=Integer.parseInt(br.readLine());
       for(int i=0;i<n;i++) {
    	   int num;
    	   String tmp=br.readLine();
    	   if(tmp.charAt(0)=='1') {
    		   num=Integer.parseInt(tmp.substring(2));
    		   stack.push(num);
    	   }
    	   else {
    		   num=Integer.parseInt(tmp);
    		   switch(num) {
    		   case 2:{
    			   if(!stack.isEmpty()) {
    				   int tem=stack.pop();
    				   bw.write(tem+"\n");
    			   }
    			   else {
    				   bw.write("-1\n");
    			   }
    			   break;
    		   }
    		   case 3:{
    			   bw.write(stack.size()+"\n");
    			   break;
    		   }
    		   case 4:{
    			   if (stack.isEmpty()) {
    				    bw.write("1\n");
    				} 
    			   else {
    				    bw.write("0\n");
    				}

    			   break;
    		   }
    		   case 5:{
    			   if(!stack.isEmpty()) {
    				   bw.write(stack.peek()+"\n");
    			   }
    			   else {
    				   bw.write("-1\n");
    			   }
    			   break;
    		   }
    		   }
    	   }
       }
       bw.flush();
       bw.close();
       br.close();
       stack.clear();
    }
}
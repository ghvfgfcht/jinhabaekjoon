import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer>deque=new LinkedList<Integer>();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			String order=st.nextToken();
			int p=0;
			if(st.hasMoreTokens()) {
				p=Integer.parseInt(st.nextToken());
			}
			switch(order) {
			case "push":{
				deque.offer(p);
				break;
			}
			case "pop":{
		
				if(deque.isEmpty()) {
					bw.write("-1"+"\n");
					break;
				}
				else {
					bw.write(deque.pollFirst()+"\n");
					break;
				}
			}
			case "size":{
				bw.write(deque.size()+"\n");
				break;
			}
			case "empty":{
				if(deque.isEmpty()) {
					bw.write("1"+"\n");
					break;
				}
				else {
					bw.write("0"+"\n");
					break;
				}
			}
			case "front":{
				if(deque.isEmpty()) {
					bw.write("-1"+"\n");
					break;
				}
				else {
					bw.write(deque.peekFirst()+"\n");
					break;
				}
			}
			case "back":{
				if(deque.isEmpty()) {
					bw.write("-1"+"\n");
					break;
				}
				else {
					bw.write(deque.peekLast()+"\n");
					break;
				}
			}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
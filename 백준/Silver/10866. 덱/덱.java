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
		Deque<Integer>deq=new LinkedList<Integer>();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			String order=st.nextToken();
			int tmp=0;
			if(st.hasMoreTokens()) {
				tmp=Integer.parseInt(st.nextToken());
			}
			switch(order) {
			case "push_front":{
				deq.offerFirst(tmp);
				break;
			}
			case "push_back":{
				deq.offerLast(tmp);
				break;
			}
			case "pop_front":{
				if(deq.isEmpty()) {
					bw.write("-1"+"\n");
					break;
				}
				else {
					bw.write(deq.pollFirst()+"\n");
					break;
				}
			}
			case "pop_back":{
				if(deq.isEmpty()) {
					bw.write("-1"+"\n");
					break;
				}
				else {
					bw.write(deq.pollLast()+"\n");
					break;
				}
			}
			case "size":{
				bw.write(deq.size()+"\n");
				break;
			}
			case "empty":{
				if(deq.isEmpty()) {
					bw.write("1"+"\n");
					break;
				}
				else {
					bw.write("0"+"\n");
					break;
				}
			}
			case "front":{
				if(deq.isEmpty()) {
					bw.write("-1"+"\n");
					break;
				}
				else {
					bw.write(deq.peekFirst()+"\n");
					break;
				}
			}
			case "back":{
				if(deq.isEmpty()) {
					bw.write("-1"+"\n");
					break;
				}
				else {
					bw.write(deq.peekLast()+"\n");
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
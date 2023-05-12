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
		Deque<Integer>queue=new LinkedList<Integer>();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine()," ");
			String order=st.nextToken();
			int q=0;
			if(st.hasMoreTokens()) {
				q=Integer.parseInt(st.nextToken());
			}
			switch(order) {
			case "push": {
				queue.offer(q);
				break;
			}
			case "pop": {
				if(queue.isEmpty()) {
					bw.write("-1"+"\n");
					break;
				}
				else {
					bw.write(queue.poll()+"\n");
					break;
				}
			}
			case "size": {
				bw.write(queue.size()+"\n");
				break;
			}
			case "empty": {
				if(queue.isEmpty()) {
					bw.write("1"+"\n");
					break;
				}
				else {
					bw.write("0"+"\n");
					break;
				}
			}
			case "front": {
				if(queue.isEmpty()) {
					bw.write("-1"+"\n");
					break;
				}
				else {
					bw.write(queue.getFirst()+"\n");
					break;
				}
			}
			case "back": {
				if(queue.isEmpty()) {
					bw.write("-1"+"\n");
					break;
				}
				else {
					bw.write(queue.getLast()+"\n");
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
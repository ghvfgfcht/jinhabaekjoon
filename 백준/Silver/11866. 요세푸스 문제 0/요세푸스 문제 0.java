import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{ 
	static Deque<Integer>queue=new LinkedList<>();
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		for(int i=1;i<=n;i++) {
			queue.offer(i);
		}
		bw.write("<");
		while(!queue.isEmpty()) {
			for(int i=1;i<k;i++) {
				int tmp=queue.pollFirst();
				queue.offer(tmp);
			}
			bw.write(queue.poll()+"");
			if(queue.size()>0) {
				bw.write(", ");
			}
		}
		bw.write(">");
		bw.flush();
		bw.close();
		br.close();
	}
}
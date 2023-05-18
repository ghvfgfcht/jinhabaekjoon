import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		Queue<Integer>queue=new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			queue.offer(i);
		}
		while(queue.size()>1) {
			bw.write(queue.poll()+" ");
			int tmp=queue.poll();
			queue.offer(tmp);
		}
		bw.write(queue.poll()+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
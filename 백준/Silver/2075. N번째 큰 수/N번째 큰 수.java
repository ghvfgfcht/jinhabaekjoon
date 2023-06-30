import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{ 
	static PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<n;j++) {
				pq.offer(Integer.parseInt(st.nextToken()));
			}
		}
		for(int i=1;i<n;i++) {
			pq.poll();
		}
		bw.write(pq.poll()+"\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
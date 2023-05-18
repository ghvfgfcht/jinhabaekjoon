import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		for(int i=0;i<n;i++) {
			int tmp=Integer.parseInt(br.readLine());
			if(tmp==0 && !pq.isEmpty()) {
				bw.write(pq.poll()+"\n");
			}
			else if(tmp==0 && pq.isEmpty()){
				if(pq.isEmpty()) {
					bw.write("0"+"\n");
				}
			}
			else {
				pq.offer(tmp);
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
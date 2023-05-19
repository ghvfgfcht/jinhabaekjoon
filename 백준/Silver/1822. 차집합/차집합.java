import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		TreeSet<Long>set=new TreeSet<Long>();
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<a;i++) {
			set.add(Long.parseLong(st.nextToken()));
		}
		st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<b;i++) {
			Long tmp=Long.parseLong(st.nextToken());
			if(set.contains(tmp)) {
				set.remove(tmp);
			}
		}
		if(set.size()==0) {
			bw.write("0"+"\n");
		}
		else {
			bw.write(set.size()+"\n");
			for(Long i: set) {
				bw.write(i+" ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
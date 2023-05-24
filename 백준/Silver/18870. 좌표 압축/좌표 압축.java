import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{ 
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int list[]=new int[n];
		int listorigin[]=new int[n];
		HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		int count=0;
		for(int i=0;i<n;i++) {
			int tmp=Integer.parseInt(st.nextToken());
			listorigin[i]=list[i]=tmp;
		}
		Arrays.sort(list);
		for(int i=0;i<n;i++) {
			int tmp=list[i];
			if(!map.containsKey(tmp)) {
				map.put(tmp, count);
				count++;
			}
		}
		for(Integer i:listorigin) {
			bw.write(map.get(i)+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
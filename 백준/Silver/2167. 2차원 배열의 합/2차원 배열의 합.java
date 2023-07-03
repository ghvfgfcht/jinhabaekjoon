import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{ 
	static int nlist[][];
	static int i;
	static int j;
	static int x;
	static int y;
	static int arr_sum(int i, int j, int x, int y) {
		int sum=0;
		for(int a=i-1;a<x;a++) {
			for(int b=j-1;b<y;b++) {
				sum+=nlist[a][b];
			}
		}
		return sum;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		nlist=new int[n][m];
		for(int a=0;a<n;a++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int b=0;b<m;b++) {
				nlist[a][b]=Integer.parseInt(st.nextToken());
			}
		}
		int k=Integer.parseInt(br.readLine());
		for(int a=0;a<k;a++) {
			st=new StringTokenizer(br.readLine()," ");
			i=Integer.parseInt(st.nextToken());
			j=Integer.parseInt(st.nextToken());
			x=Integer.parseInt(st.nextToken());
			y=Integer.parseInt(st.nextToken());
			bw.write(arr_sum(i,j,x,y)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
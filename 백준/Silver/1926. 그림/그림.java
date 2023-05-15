import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	static int dx[]= {0,0,-1,1};
	static int dy[]= {-1,1,0,0};
	static boolean visited[][];
	static int map[][];
	static int n;
	static int m;
	static int max=0;
	static int cnt=0;
	static int num=0;
	static void dfs(int y, int x) {
		visited[y][x]=true;
		for(int i=0;i<4;i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>=0&&ny>=0&&nx<m&&ny<n&&map[ny][nx]!=0&&!visited[ny][nx]) {
				dfs(ny, nx);
				num++;
			}
		}
		max=Math.max(max,num);
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		visited=new boolean[n][m];
		map=new int[n][m];
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine()," ");
			for(int j=0;j<m;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(map[i][j]!=0&&!visited[i][j]) {
					num=1;
					dfs(i,j);
					cnt++;
				}
			}
		}
		bw.write(cnt+"\n"+max);
		bw.flush();
		bw.close();
		br.close();
	}
}
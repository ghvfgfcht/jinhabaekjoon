import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken()),y=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(br.readLine());
        List<Integer> arrX = new ArrayList<>();
        List<Integer> arrY = new ArrayList<>();
        arrX.add(0); arrX.add(x);
        arrY.add(0); arrY.add(y);
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int dir=Integer.parseInt(st.nextToken()),num=Integer.parseInt(st.nextToken());
            if(dir==0) arrY.add(num);
            else arrX.add(num);
        }
        Collections.sort(arrX);
        Collections.sort(arrY);
        int maxX=0,maxY=0;
        for(int i=1;i<arrX.size();i++) 
            maxX=Math.max(maxX,arrX.get(i)-arrX.get(i-1));
        for(int i=1;i<arrY.size();i++) 
            maxY=Math.max(maxY,arrY.get(i)-arrY.get(i-1));
        System.out.println(maxX*maxY);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{ 
    public static void main(String[] args) throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int n=Integer.parseInt(br.readLine());
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<n;i++) {
    		String semina=br.readLine();
    		switch(semina) {
    		case "Algorithm":{
    			sb.append("204\n");
    			break;
    		}
    		case "DataAnalysis":{
    			sb.append("207\n");
    			break;
    		}
    		case "ArtificialIntelligence":{
    			sb.append("302\n");
    			break;
    		}
    		case "CyberSecurity":{
    			sb.append("B101\n");
    			break;
    		}
    		case "Network":{
    			sb.append("303\n");
    			break;
    		}
    		case "Startup":{
    			sb.append("501\n");
    			break;
    		}
    		case "TestStrategy":{
    			sb.append("105\n");
    			break;
    		}
    		}
    	}
    	System.out.println(sb);
     }
}
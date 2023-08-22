import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp=br.readLine();
        switch(tmp) {
        case "M":{
        	bw.write("MatKor\n");
        	break;
        }
        case "W":{
        	bw.write("WiCys\n");
        	break;
        }
        case "C":{
        	bw.write("CyKor\n");
        	break;
        }
        case "A":{
        	bw.write("AlKor\n");
        	break;
        }
        case "$":{
        	bw.write("$clear\n");
        	break;
        }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
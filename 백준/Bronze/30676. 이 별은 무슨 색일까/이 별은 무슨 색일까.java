import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        if(num>=620 && num<=780){
            System.out.println("Red");
        }
        else if(num>=590 && num<620){
            System.out.println("Orange");
        }
        else if(num>=570 && num<590){
            System.out.println("Yellow");
        }
        else if(num>=495 && num<570){
            System.out.println("Green");
        }
        else if(num>=450 && num<495){
            System.out.println("Blue");
        }
        else if(num>=425 && num<450){
            System.out.println("Indigo");
        }
        else if(num>=380 && num<425){
            System.out.println("Violet");
        }
    }
}
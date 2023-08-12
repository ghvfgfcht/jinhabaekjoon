import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;

public class Main{ 
    public static void main(String[]args) throws IOException{
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      LocalDate date=LocalDate.now();
      bw.write(date.getYear()+"\n"+date.getMonthValue()+"\n"+date.getDayOfMonth()+"\n");
      bw.flush();
      bw.close();
    }
}
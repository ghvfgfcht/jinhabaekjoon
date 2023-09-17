import java.io.IOException;

public class Main{ 
	public static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
   }
    public static void main(String[] args) throws IOException{
    	 boolean[] isSelfNumber = new boolean[10001];

         for (int i = 1; i <= 10000; i++) {
             int dn = d(i);
             if (dn <= 10000) {
                 isSelfNumber[dn] = true;
             }
         }
         for (int i = 1; i <= 10000; i++) {
             if (!isSelfNumber[i]) {
                 System.out.println(i);
             }
         }
     }
}
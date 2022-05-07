import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner input = new Scanner (System.in);
		
		double H, P, MEDIA;
		
		H = input.nextDouble();
		P = input.nextDouble();
		
		MEDIA = H / P;
		
		System.out.printf("%.2f\n", MEDIA);
		
		input.close();
 
    }
 
}
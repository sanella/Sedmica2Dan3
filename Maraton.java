import java.util.Random;

public class Maraton {
	public static void main(String[] args) {
		Random zamisljac = new Random();
		int x = zamisljac.nextInt(6)+1;
		int pogodak;
		do { 
			pogodak = TextIO.getlnInt();
			
	} while (pogodak != x);
	System.out.println("Bravo");
		
		
		
	}
}

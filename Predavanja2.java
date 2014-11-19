
public class Predavanja2 {
	public static void main(String[] args) {
		int number = 5 ;
		int jedan = number - 4 ;
		int dva = number - 3 ;
		int tri = number - 2;
		System.out.println(number);
		System.out.println("| " + jedan + " | " + dva + " | " + tri);
		System.out.printf("| %d | %d | %d |\n", jedan, dva, tri) ;
		
		int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7, h = 8, i = 9, j = 10 ;
		System.out.printf("%5d%5d%5d%5d%5d\n%5d%5d%5d%5d%5d\n", a, b, c, d, e, f, g, h, i, j) ;
		
		System.out.print("Unesi double broj");
		double broj = TextIO.getlnDouble() ;
		System.out.printf("broj je %f\n", broj) ;
		
	}
}

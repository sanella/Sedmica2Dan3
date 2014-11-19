
public class TextIOvsScenner {
	public static void main(String[] args) {
		
		System.out.println("Unesi jedan broj");
		int brojA = TextIO.getInt();
		
		System.out.println("Unesi drugi broj") ;
		int brojB = TextIO.getInt();
		
		System.out.println("Unesi treci broj") ;
		int brojC = TextIO.getInt();
		
		if  (brojA>brojB && brojA>brojC ){
			System.out.println("Ispisi veci broj" + brojA) ;}
		if (brojB>brojA && brojB>brojC) { 
			System.out.println("Ispisi veci broj" + brojB); }
		if (brojC>brojA && brojC>brojB)
		 {
			System.out.printf("Ispisi veci broj %d", brojB);}
		
		}
				
				
	}
			
		
	


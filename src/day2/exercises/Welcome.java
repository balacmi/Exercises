package day2.exercises;

public class Welcome {

	public static void main(String[] args) {		
		int x = 2;
		for (;x < 10; x++) {			
			System.out.println(x++);
		}
		
		byte i = 0;
		
		do {
			byte a = (i++);
			byte b = --a;
			System.out.println(a + " " + b + " " + i);
			
		} while (i < 0);
		
		
	}
}
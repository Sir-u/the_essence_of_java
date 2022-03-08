package ch2;

public class StringEx {

	public static void main(String[] args) {

		/*
		 * int Num = 10_000_000; int octNum = 010000000; int hexNum = 0xFFF; int binNum
		 * = 0b1000000;
		 * 
		 * System.out.println(Num); System.out.println(octNum);
		 * System.out.println(hexNum); System.out.println(binNum);
		 * 
		 * float pi = 3.14f; double rate = 1.1; double pNum = 0x12p3;
		 * 
		 * System.out.println(pi); System.out.println(rate); System.out.println(pNum);
		 */

		char ch = 'J';
		String name = "Ja" + "va";
		String str = name + 8.0;

		System.out.println(ch);
		System.out.println(name);
		System.out.println(str);
		System.out.println(" " + 7);
		System.out.println(7 + " ");
		System.out.println(" " + " ");
		System.out.println(" " + "7");
		System.out.println(7 + 7);
		System.out.println("7" + "7");
		System.out.println("" + 7 + 7);
		System.out.println(7 + 7 + "" + 7 + 7);

	}

}

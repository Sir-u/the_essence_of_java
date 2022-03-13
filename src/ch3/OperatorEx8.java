package ch3;

public class OperatorEx8 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;

		// long c = a * b; //결과값 또한 int형이기 때문에 int형으로 변환된 값이 long c에 저장
		long c = (long)a * b;
		System.out.println(c);
	}
}
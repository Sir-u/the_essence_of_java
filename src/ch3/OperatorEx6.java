package ch3;

public class OperatorEx6 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		//byte c = a + b; //컴파일  에러가 발생, 따라서 명시적 형변환이 필요 byte c = (byte)(a+b);
		byte c = (byte)(a+b);
		System.out.println(c);
	}
}
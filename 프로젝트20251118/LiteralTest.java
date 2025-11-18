package 김민호;

public class LiteralTest {
	public static void main(String[] args) {
		int m1 = 15;
		int m2 = 015;
		int m3 = 0x15;
		
		float f = 12.3f;
		double d = 12.3;
		
		char c1 = '\u0042';
		char c2 = '\uae00';
		
		boolean b = true;
		
		String str1 = null;
		String str2 = "I love you";
		final double PI = 3.141592;
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(b);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(PI);
	}
}

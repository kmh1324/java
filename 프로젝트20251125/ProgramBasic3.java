package 프로젝트20251125;

public class ProgramBasic3 {
	public static void main(String[] args) {
		String str1 = new String("I Love You!!");
		String str2 = str1;
		String str3 = new String("I Love You!!");
		
		if (str1 == str2)
			System.out.println("true1");
		if (str1 == str3)
			System.out.println("true2");
	}
}

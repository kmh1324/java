package 프로젝트20251125;

public class ProgramBasic4 {
	public static void main(String[] args) {
		String Str1 = new String("I Love You!!");
		String Str2 = Str1;
		String Str3 = new String("I Hate You!!");
		
		if (Str1.compareTo(Str2) == 0)
			System.out.println("Greater");
		
		else if (Str1.compareTo(Str3) > 0)
		System.out.println("Less");
		
		else
			System.out.println("Equal");
	}
}

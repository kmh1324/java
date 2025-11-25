package 프로젝트20251125;

public class ProgramBasic2 {
	public static void main(String[] args) {
		String Str1 = new String("I Love You!!");
		String Str2 = Str1;
		String Str3 = new String("I Love You!!");
		boolean retVal;
		
		retVal = Str1.equals( Str2 );
		System.out.println("Returned Value = " + retVal);
		
		retVal = Str1.equals( Str3 );
		System.out.println("Returned Value = " + retVal);
	}
}

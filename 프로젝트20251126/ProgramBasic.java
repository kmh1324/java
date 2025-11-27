package 프로젝트20251126;

public class ProgramBasic {
	public static void main(String[] args) {
		String regExp = " |,|:|\\.";
		String words = "one two,three:four.five";
		String newStr = words.replaceAll(regExp, "-");
		System.out.println(newStr);
		
		String str = "abCD";
		String upperStr = str.toUpperCase();
		String lowerStr = str.toLowerCase();
		System.out.println(upperStr);
		System.out.println(lowerStr);
		
		String str0 = " this is a test *** ";
		String str1 = str0.trim();
		System.out.println(str1);
	}
}
package 프로젝트20251125;

public class ProgramBasic {
	public static void main(String[] args) {
		String str1, str2, str3, str4, str5;
		char [] charArray = {'I', ' ', 'L', 'o', 'v', 'e', ' ', 'Y', 'o', 'u'};
		
		str1 = "Hi, Byeong Man";
		str2 = new String(str1);
		str3 = new String(charArray);
		str4 = new String(charArray, 2, 4);
		
		System.out.println(str1 + str2 + str3 + str4);
		
		char[] t = str1.toCharArray();
		for (int i = 0; i < t.length; i++)
			System.out.print(t[i]);
		
		String str = "I Love You";
		char[] t1 = str.toCharArray();
		t1[3] = 'v';
		str = new String(t1);
		System.out.println(str);
	} 
}

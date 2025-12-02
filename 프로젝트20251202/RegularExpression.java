package 프로젝트20251202;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	private static String getString(String s1, String s2, String s3) {
		Scanner sc = new Scanner(System.in);
		Pattern p;
		Matcher m;
		String input;
		
		//코드반복해서 틀렸으면 되묻긴
		System.out.println(s1);
		input = sc.nextLine();
		p = Pattern.compile(s2);
		m = p.matcher(input);
		if (!m.matches())
		{
			System.out.println(s3);
			return null;
		}
		return input;
	}
	
	public static void main(String[] args) {
		String name = getString("이름 : ","^[가-힣]{2,4}$","이름 형식에 맞지 않습니다.");
		
		String adress = getString("주소 : ", 
				"^[가-힣]{2,4}도\\s+[가-힣]{2,4}시\\s+[가-힣]{2,6}로\\s+\\d{2,4}$", "주소 형식에 맞지 않습니다.");
//		
		String post_code= getString("우편번호 : ", "^\\d{5}$", "우편번호 형식에 맞지 않습니다.");
		
		String phone_number = getString("핸드폰 번호 : ", "01[01]-\\d{4}-\\d{4}$", "핸드폰 번호 형식에 맞지 않습니다.");
		
		//혈액형
		//
		//
		
		
//		Scanner sc = new Scanner(System.in);
//		String input;
//		Pattern pattern;
//		Matcher m;
//		
//		System.out.println("이름 : ");
//		input = sc.nextLine();
//		pattern = Pattern.compile("^[가-힣]{2,4}$");
//		m = pattern.matcher(input);
//		if(!m.matches()) {
//			System.out.println("이름 형식에 맞지 않습니다.");
//			return;
//		}
//		
//		System.out.println("주소 : ");
//		input = sc.nextLine();
//		pattern = Pattern.compile("^[가-힣]{2,4}도\\s+[가-힣]{2,4}시\\s+[가-힣]{2,6}로\\s+\\d{2,4}$");
//		m = pattern.matcher(input);
//		if (!m.matches()) {
//			System.out.println("주소 형식에 맞지 않습니다.");
//			return;
//		}
//		
//		System.out.println("우편번호 : ");
//		input = sc.next();
//		pattern = Pattern.compile("^\\d{5}$");
//		m = pattern.matcher(input);
//		if (!m.matches()) {
//			System.out.println("우편번호 형식에 맞지 않습니다.");
//			return;
//		}
//		
//		System.out.println("핸드폰 번호 : ");
//		input = sc.next();
//		pattern = Pattern.compile("01[01]-\\d{4}-\\d{4}$");
//		m = pattern.matcher(input);
//		if (!m.matches()) {
//			System.out.println("핸드폰 번호 형식에 맞지 않습니다.");
//			return;
//		}
		
		System.out.println("모든 자료를 형식에 맞게 입력하셨습니다.");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + adress);
		System.out.println("우편 번호 : " + post_code);
		System.out.println("핸드폰 번호 : " + phone_number);
	}

}

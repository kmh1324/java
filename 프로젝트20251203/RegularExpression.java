package 프로젝트20251203;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	private static String getString(String s1, String s2, String s3) {
		Scanner sc = new Scanner(System.in);
		Pattern p;
		Matcher m;
		String input;

		while (true) {
			System.out.println("(종료 : z)" + s1);
			input = sc.nextLine();
			if (input.equals("z")) {
				System.out.println("입력을 종료합니다.");
				return null;
			}

			p = Pattern.compile(s2);
			m = p.matcher(input);

			if (!m.matches()) {
				System.out.println(s3);
				continue;
			}

			return input;
		}
	}

	public static void main(String[] args) {
		String name = getString("이름 : ", "^[가-힣]{2,4}$", "이름 형식에 맞지 않습니다.");

		String adress = getString("주소 : ",
				"^[가-힣]{2,4}도\\s+[가-힣]{2,4}시\\s+[가-힣]{2,6}로\\s+\\d{2,4}$", "주소 형식에 맞지 않습니다.");

		String postCode = getString("우편번호 : ", "^\\d{5}$", "우편번호 형식에 맞지 않습니다.");

		String phoneNumber = getString("핸드폰 번호 : ", "01[01]-\\d{4}-\\d{4}$", "핸드폰 번호 형식에 맞지 않습니다.");

		String bloodType = getString("혈액형 : ", "^(A|B|O|AB)$", "혈액형 형식에 맞지 않습니다.");

		String emailAdress = getString("이메일 주소 : ", "^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z.]+$", "이메일 주소 형식에 맞지 않습니다.");

		String cardNumber = getString("카드번호 : ", "^\\d{4}-\\d{4}-\\d{4}-\\d{4}$", "카드번호 형식에 맞지 않습니다.");


		System.out.println("모든 자료를 형식에 맞게 입력하셨습니다.");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + adress);
		System.out.println("우편 번호 : " + postCode);
		System.out.println("핸드폰 번호 : " + phoneNumber);
		System.out.println("혈액형 : " + bloodType);
		System.out.println("이메일 주소 : " + emailAdress);
		System.out.println("카드번호 : " + cardNumber);
	}

}
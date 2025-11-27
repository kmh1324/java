package 프로젝트20251127;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String[] IDs = new String[100];
		String[] PWs = new String[100];
		int count = 0;

		int menu;
		while (true) {
			System.out.println("메뉴를 선택해주세요 . (1. 회원가입, 2. 로그인, 3. 종료) : ");
			Scanner sc = new Scanner(System.in);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				SignUp(IDs, PWs, count);
				break;
			case 2:
				SignIn(IDs, PWs, count);
				break;
			case 3:
				System.out.println("메뉴가 종료되었습니다.");
				sc.close();
				break;
			}
			
		System.out.println("현재 " + count + "명이 회원가입했습니다.");
		}
	}

	public static void SignUp(String[] IDs, String[] PWs, int count) {
		String ID;
		String PW;

		System.out.println("아이디를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		ID = sc.nextLine();
		for (int i = 0; i < count; i++)
			if (ID.equals(IDs[i])) {
				System.out.println("존재하는 ID입니다.");
				return;
			}

		System.out.println("비밀번호를 입력하세요 : ");
		PW = sc.nextLine();
		IDs[count] = ID;
		PWs[count] = PW;
		count++;

	}

	public static void SignIn(String[] IDs, String[] PWs, int count) {
		String ID;
		String PW;
		int info = 0;
		boolean bool = false;

		System.out.println("아이디를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		ID = sc.next();
		for (int i = 0; i < count; i++)
			if (ID.equals(IDs[i])) {
				info = count;
				bool = true;
			}
		if (!bool) {
			System.out.println("ID가 존재하지 않습니다.");
			return;
		}

		System.out.println("비밀번호를 입력하세요 : ");
		PW = sc.next();
		if (PW.equals(PWs[info]))
			System.out.println("로그인 성공.");
		else
			System.out.println("아이디가 일치하지 않습니다.");
	}
}

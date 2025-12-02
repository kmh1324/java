package 프로젝트20251202;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String[] IDs = new String[100];
		String[] PWs = new String[100];
		int count = 0;

		int menu;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("메뉴를 선택해주세요 . (1. 회원가입, 2. 로그인, 3. 종료) : ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				count = SignUp(IDs, PWs, count);
				break;
			case 2:
				SignIn(IDs, PWs, count);
				break;
			case 3:
				System.out.println("메뉴가 종료되었습니다.");
				sc.close();
				return;
			}
			
		System.out.println("현재 " + count + "명이 회원가입했습니다.");
		}
	}

	public static int SignUp(String[] IDs, String[] PWs, int count) {
		String ID;
		String PW;

		System.out.println("아이디를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		ID = sc.nextLine();
		for (int i = 0; i < count; i++)
			if (ID.equals(IDs[i])) {
				System.out.println("존재하는 ID입니다.");
				return count;
			}

		System.out.println("비밀번호를 입력하세요 : ");
		PW = sc.nextLine();
		IDs[count] = ID;
		PWs[count] = PW;
		count++;
		
		return count;
	}

	public static void SignIn(String[] IDs, String[] PWs, int count) {
		String ID;
		String PW;
		int info = -1;

		System.out.println("아이디를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		ID = sc.next();
		System.out.println("비밀번호를 입력하세요 : ");
		PW = sc.next();
		for (int i = 0; i < count; i++)
			if (ID.equals(IDs[i])&& PW.equals(PWs[i])) 
				info = i;

		if (info != -1) {
			System.out.println("로그인 성공.");
			SeatReservation.main(null);
		}
		else
			System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
	}
}

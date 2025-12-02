package 프로젝트20251202;

import java.util.Scanner;

public class SearchReplace2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장 입력 : ");
		StringBuilder statement = new StringBuilder(sc.nextLine());
		System.out.println("찾고자 하는 단어 : ");
		String sword = sc.next();
		System.out.println("바꾸고자 하는 단어 : ");
		String rword = sc.next();
		
		int start = statement.indexOf(sword);
		int end = start + sword.length();
		statement.replace(start, end, rword);
		System.out.println(statement);
	}
}

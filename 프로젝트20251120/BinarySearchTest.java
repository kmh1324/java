package 프로젝트20251120;

import java.util.Arrays;

public class BinarySearchTest {
	public static void main(String[] args) {
		int [] a = new int[] {3, 2, 1, 4, 5};
		
		Arrays.sort(a);
		
		int i = Arrays.binarySearch(a, 3);
		System.out.println(i);
		
		i = Arrays.binarySearch(a, 0);
		System.out.println(i);
		
		i = Arrays.binarySearch(a, 6);
		System.out.println(i);
	}
}

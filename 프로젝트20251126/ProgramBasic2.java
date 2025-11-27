package 프로젝트20251126;

public class ProgramBasic2 {
	public static void main(String[] args) {
		String delimStr = " ";
		String words = "minus one	two,three:four.five";
		String [] split = null;
		split = words.split(delimStr);
		for (String s : split) 
			System.out.println("-" + s + "-");
	}
}

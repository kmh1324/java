package 프로젝트20251204;

public class MyApp1 {
	public static void main(String[] args) {
		StaticTest ob1 = new StaticTest();
		StaticTest ob2 = new StaticTest();
		
		ob1.setValue(3);
		System.out.println(ob2.getValue());
		
		ob1.setInstVal(5);
		System.out.println(ob2.getInstVal());
	}
}

class StaticTest {
	static int value;
	int instVal;
	
	void setValue(int n) {
		value = n;
	}
	
	int getValue() {
		return value;
	}
	
	void setInstVal(int n) {
		instVal = n;
	}
	
	int getInstVal() {
		return instVal;
	}
}
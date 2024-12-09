package Test8;

public class TestObj {
	
	void print1() {
		System.out.println("안녕하세요");
	}
	
	String print2() {
		return "안녕하세요";
	}
	String name;
	void print3(String name) {
		System.out.println(name + "님 안녕하세요");
	}
	
	String print4(String name) {
		return name + "님 안녕하세요";
	}
	public static void main(String[] args) {
		
		TestObj obj = new TestObj();
		
		obj.print1(); // "안녕하세요" 출력
		String str = obj.print2();
		System.out.println(str);// "안녕하세요" 출력
		obj.print3("홍길동"); // "홍길동님 안녕하세요" 출력
		
		String str2 = obj.print4("홍길동");
		System.out.println(str2);// "홍길동님 안녕하세요" 출력
		
	}
}

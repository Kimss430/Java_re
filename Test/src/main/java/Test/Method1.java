package Test;

public class Method1 {
	public static void printHello() {
		System.out.println("Hello");
		
	}
	public static String returnHello() {
		return "Hello";
	}
	public static String returnStr(String str) {
		// 받은텍스트 + "를(을) 리턴합니다."
		return str + "를(을) 리턴합니다.";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = returnHello();
		System.out.println(str);
		
		String str2 = returnStr("안녕");
	}

}

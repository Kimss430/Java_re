package Test2;

public class Human {
	String name;
	int age;
	String addr;
	
	public Human() {}
	// 생성자
	// 클래스 이름과 동일, 변수초기화
	public Human(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		
	}
}

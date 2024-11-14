package Test2;

public class Student extends Human{
	
	String stuNo;
	public Student(String name, int age, String addr, String stuNo) {
		// 부모 클래스의 생성자 초기화는 첫줄에 입력
		super(name, age, addr);
		this.stuNo = stuNo;
	}
	public void stuInfo() {
		System.out.println("학번은 " + stuNo + " 입니다.");
	}
	
	// 오버라이딩
	// 부모클래스의 info 재정의
	public void info() {
		super.info();
		System.out.println("학번은 " + stuNo + " 입니다.");
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("주소 : " + addr);
	}

}

package Test2;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Human h = new Human("홍길동", 30, "서울");
		h.info();
		
		Student stu = new Student("홍길동", 30, "서울", "12345678");
		stu.stuInfo(); // 학번은 12345678 입니다.		
		stu.info();
		
	}

}

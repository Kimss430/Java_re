package Test5;

public class StuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student hong = new Student(1234, "홍길동");
		Student yu = new Student(1357, "유재석", "컴퓨터학과");
		
		hong.setInfo(20, "남");
		
		System.out.println(hong.getAge());
	}

}

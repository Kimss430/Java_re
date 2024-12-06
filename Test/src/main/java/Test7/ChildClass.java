package Test7;

public class ChildClass extends ParentClass{

	public ChildClass() {
		super("");
	}
	public ChildClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	void objType(Object obj){
		if(obj instanceof String) {
			System.out.println("문자열 입니다.");
		} else if (obj instanceof Integer) {
			System.out.println("정수 입니다.");
		} else {
			System.out.println("문자나 정수가 아닙니다.");
		}
	}
}

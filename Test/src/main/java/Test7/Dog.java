package Test7;

public class Dog extends Animal{
	String type;
	Dog(){
		super("정보없음", 0);
	}
	Dog(String name, int age, String type) {
		super(name, age);
		this.type = type;
	}
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	void sound() {
		System.out.println("멍멍!");
	}
	String getBreed(){
		return this.type;
	}
}

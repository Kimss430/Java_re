package Test7;

public class Human {
	
	static int paper; // 공동 사용 a4용지
	String name;
	int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}

	static void humanInfo(Human c) {
		if (c instanceof Student) {
			System.out.println("이 객체는 Student 클레스 객체 입니다.");
		}
		if (c instanceof Worker) {
			System.out.println("이 객체는 Worker 클레스 객체 입니다.");
		}
		if (c instanceof Researcher) {
			System.out.println("이 객체는 Researcher 클레스 객체 입니다.");
		}
	}
	
	static void fruitBox(Fruit fr) {

		if (fr instanceof Orange) {
			System.out.println("오렌지는 맛있다.");
		}
		if (fr instanceof Apple) {
			System.out.println("사과는 비싸다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("홍길동", 30);
		Worker w = new Worker("김철수", 20);
		Researcher r = new Researcher("박영희", 25);
		humanInfo(s);
		humanInfo(w);
		humanInfo(r);
		Orange o = new Orange("오렌지", "오렌지색", 1000);
		Apple a = new Apple("사과", "빨간색", 5000);
		fruitBox(o);
		fruitBox(a);
	}

}

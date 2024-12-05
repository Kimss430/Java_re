package Test5;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("홍길동", 20);
		person.setPhone("123-123");
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getPhone());
		
	}

}

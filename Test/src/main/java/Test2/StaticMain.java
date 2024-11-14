package Test2;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static s1 = new Static();
		s1.money1 = 9000;
		s1.money2 = 9000;
		
		Static s2 = new Static();
		s2.money1 = s2.money1 - 2000;
		s2.money2 = s2.money2 - 2000;
		
		System.out.println(s1.money1);
		System.out.println(Static.money2);
	}

}

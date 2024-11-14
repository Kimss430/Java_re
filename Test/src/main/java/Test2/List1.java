package Test2;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add("test");
		list.add(15);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		
		}
	}
}

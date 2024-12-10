package Test9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		System.out.println("성적관리 시스템");
		for (int i = 0; i < 3; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("이름 : ");
			map.put("name", scan.next());
			System.out.print("자바 : ");
			map.put("java", scan.nextInt());
			System.out.print("오라클 : ");
			map.put("oracle", scan.nextInt());
			System.out.print("html : ");
			map.put("html", scan.nextInt());

			list.add(map);
		}

		for (int i = 0; i < list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			int sum = (int) user.get("java") + 
					(int) user.get("oracle") + (int) user.get("html");
			System.out.println("이름 : " + user.get("name") + ", 총점 : " + sum + "점");
		}

	}
	

}

package Test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i=1; i<=3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.println(i + "번째 사람 입력");
			System.out.print("이름 : ");
			map.put("name", scan.nextLine());
			System.out.print("나이 : ");
			map.put("age", scan.nextLine());			
			list.add(map);
		}
		System.out.println(list);
	}

}

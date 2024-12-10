package Test9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
			System.out.print("메뉴 선택 : ");
			String menu = scan.next();
			
			if(menu.equals("1")) {
				System.out.print("과일명 입력 : ");
				map.put("name", scan.next());
				System.out.print("가격 입력 : ");
				map.put("price", scan.nextInt());
				System.out.print("갯수 입력 : ");
				map.put("num", scan.nextInt());
				
				list.add(map);
			} else if(menu.equals("2")) {
				System.out.print("과일명 입력 : ");
				String inputName = scan.next();
				System.out.print("갯수 입력 : ");
				int inputNum = scan.nextInt();
				
				for(int i = 0; i < list.size(); i ++) {
					String name = (String )list.get(i).get("name");
					if(inputName.equals(name)) {
						int num = (int) list.get(i).get("num");
						list.get(i).put("num", num - inputNum);
						System.out.println("판매 되었습니다.");
						System.out.println(name + "의 현재 남은 개수는" + (num - inputNum) + "개 입니다.");
					}
				}
			} else if(menu.equals("3")) {
				System.out.print("과일명 입력 : ");
				String inputName = scan.next();
				for(int i = 0 ; i < list.size(); i++) {
					String name = (String)list.get(i).get("name");
					if(inputName.equals("name")) {
						int num = (int)list.get(i).get("num");
						System.out.println(name + "의 현재 남은 개수는" + num + "개 입니다.");
					}
				}
			} else {
				System.out.println("종료 !");
				break;
			}
		}
		
	}

}

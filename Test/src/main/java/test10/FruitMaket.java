package test10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMaket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		while(true) {
			System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
			System.out.print("메뉴 선택 : ");
			int menu = s.nextInt();
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일명 : ");
				String inputName = s.next();
				boolean isFruit = false;
				for(int i=0; i<list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(inputName.equals(name)) {
						isFruit = true;
						System.out.print("개수 : ");
						int inputNum = s.nextInt();
						if(inputNum < 0) {
							System.out.println("음수 입력 안됨");
							break;
						} 
						list.get(i).put("num", (int) list.get(i).get("num") + inputNum);
					}
				}
				if(!isFruit) {
					map.put("name", inputName);
					System.out.print("가격 : ");
					int price = s.nextInt();
					if(price < 0) {
						System.out.println("음수 입력 안됨");
						continue;
					} else {
						map.put("price", price);
					}
					
					System.out.print("개수 : ");
					int num = s.nextInt();
					if(num < 0) {
						System.out.println("음수 입력 안됨");
						continue;
					} else {
						map.put("num", num);
					}
					list.add(map);
				}
				
			} else if(menu == 2) {
				// 판매
				System.out.print("과일명 : ");
				String inputName = s.next();
				System.out.print("개수 : ");
				int inputNum = s.nextInt();
				if(inputNum < 0) {
					System.out.println("음수 입력 안됨");
					continue;
				} 
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					String name = (String) map.get("name");
					if(inputName.equals(name)) {
						int num = (int) map.get("num");
						if(num < inputNum) {
							System.out.println("개수 부족!");
						} else {
							map.put("num", num - inputNum);
							System.out.println("현재 남은 " + name +  "의 개수는 " + map.get("num") + "개");
						} 
						
					}
				}
			} else if(menu == 3) {
				// 개수확인
				System.out.print("과일 명 : ");
				String inputName = s.next();
				for(int i=0; i<list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(inputName.equals(name)) {
						System.out.println("현재 남은 " + name +  "의 개수는 " + list.get(i).get("num") + "개");
					}
				}
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
	}

}

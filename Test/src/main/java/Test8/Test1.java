package Test8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("미래장학금관리시스템입니다.");
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i ++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("이름과 학점>> ");
			map.put("name", scan.next());
			map.put("score", scan.nextDouble());
			
			list.add(map);
		}
		
		System.out.print("장학생 선발 학점 기준 입력>> ");
		double limite = scan.nextDouble();
		System.out.print("장학생 명단 : ");
		
		for(int i = 0; i < list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			double score = (double) user.get("score");
			if(score >= limite) {
				System.out.print(user.get("name") + " ");
			}
			
		}
		
	}

}

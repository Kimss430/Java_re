package Test2;

import java.util.ArrayList;
import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<Object, Object>> list = new ArrayList<>();
		HashMap<Object, Object> map = new HashMap<>();
		
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("addr", "인천");
		list.add(map);
		
		System.out.println(list);
	}
	
}

package Test3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 
//		 배열에서 중복 제거
//		결과 예시 : {10, 20, 5, 30, 25} (정렬은 상관x)
		int arr[] = {10, 20, 5, 10, 30, 5, 10, 25};
		
		arr = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(arr));
	}

}

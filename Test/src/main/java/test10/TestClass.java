package test10;

import java.util.Arrays;

public class TestClass {
	
	
	void info() {
		System.out.println("테스트 클래스 입니다.");
	}

	static int[] getArr(){
		int arr[] = {3, 5, 2, 1, 4};
		return arr;
	}
	
	static String sumArr(int[] arr, int i, int j) {
		int sumArr = (int) (arr[i]+arr[j]);
		return "배열의 " + i + "," + j + " 번째 인덱스 값의 합은 " + sumArr + " 입니다.";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		TestClass testClass = new TestClass();
		testClass.info(); // 출력 결과 : '테스트 클래스 입니다.'

		// 2.
		int arr[] = testClass.getArr();
		System.out.println(Arrays.toString(arr)); 
		// 출력 결과 : [3, 5, 2, 1, 4]

		// 3. 
		String str = testClass.sumArr(arr, 1, 3);
		System.out.println(str);
		// 출력 결과 : '배열의 1, 3 번째 인덱스 값의 합은 6 입니다.'
		// ([3, 5, 2, 1, 4] 배열에서 1,3 번째 인덱스 값의 합을 의미)
	}
}

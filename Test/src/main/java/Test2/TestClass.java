package Test2;

public class TestClass {

	
	public void info() {
		System.out.println("테스트 클래스 입니다.");
	}
	public int[] getArr() {
		int arr[] = {1, 3, 5, 2, 4};
		return arr;
	}
	public String sumArr(int arr[], int x, int y) {
		return "배열의" + x + "," + y + "번째 인덱스 값의 합은" + (arr[x] + arr[y]) + "입니다.";
	}
}

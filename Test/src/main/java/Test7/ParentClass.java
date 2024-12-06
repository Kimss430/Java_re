package Test7;

public class ParentClass {
	String name;
	int x;

	public ParentClass(String name) {
		this.name = name;
	}

	void gugudan(int x) {
		this.x = x;
		if(x == 3) {
			System.out.println(name + "님 자바 클래스 테스트를 시작합니다!");
		}
		for (int j = 1; j <= 9; j++) {
			System.out.println(x + " * " + j + " = " + x * j);
		}
		if(x == 6) {
			System.out.println("== 종료 되었습니다. ==");
		}
	}

	int arrBigNum(int[] arr) {
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		int bigNumber = arr[maxIndex];
		return bigNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass p = new ParentClass("홍길동");
		p.gugudan(3); // 구구단 3단 출력

		int arr[] = { 3, 5, 2, 4, 1 };
		int bigNumber = p.arrBigNum(arr);
		System.out.println("배열에서 가장 큰 수는 " + bigNumber); // 배열에서 가장 큰 수는 5

		System.out.println("----------------------------------- \n");

		ChildClass c = new ChildClass();
		c.gugudan(6); // 안내 문구 후 6단 출력

		c.objType("안녕"); // 문자열 입니다.
		c.objType(123); // 정수 입니다.
		c.objType(p); // 문자나 정수가 아닙니다.
	}

}

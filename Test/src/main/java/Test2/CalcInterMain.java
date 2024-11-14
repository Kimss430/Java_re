package Test2;

import java.util.Arrays;

public class CalcInterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		int arr[] = {1,2,3,4,5};
		System.out.println(calc.add(1, 2));
		System.out.println(calc.addArr(arr));
		Student s = calc.studentInfo("홍길동", 30, "서울", "12345");
		s.stuInfo();
		System.out.println(Arrays.toString(calc.changeArr(arr)));
		
		
	}

}

package Test3;

import java.util.Scanner;

public abstract class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2. 숫자를 1개 입력받아서 80이상일 경우 'A', 60 이상일 경우 'B'
//		그 외에는  'C'를 출력. 
//		단, 100 초과된 숫자나 음수를 입력했을 경우
//		'잘못된 숫자 범위 입니다' 출력 후 종료
		
		Scanner scan = new Scanner(System.in);
		for(;;) {
			System.out.println("숫자를 입력하세요.");
			int num1 = scan.nextInt();
			if (num1 > 100 || num1 < 0) {
				System.out.println("잘못된 숫자 범위 입니다.");
			} else if(num1 >= 80 && num1 < 100) {
				System.out.println("A");
			} else if(num1 >= 60) {
				System.out.println("B");
			} else {
				System.out.println("C");
			} 
			break;
		}
		
	}

}

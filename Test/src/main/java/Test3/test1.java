package Test3;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 2개의 숫자를 입력받아서 두 수의 합이 홀수일 경우
//		'홀수' 출력, 짝수일 경우 '짝수' 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int x = scan.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int y = scan.nextInt();
		int sum = x + y;
		if(sum % 2 == 0) {
			System.out.println("두 수의 합은 짝수");
		} else {
			System.out.println("두 수의 합은 홀수");
		}
	}

}

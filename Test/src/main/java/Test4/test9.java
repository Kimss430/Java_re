package Test4;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 숫자를 1개 입력받고 아래 조건에 맞게 조건문을 작성하시오.
//		조건) 입력받은 숫자가 65~100 사이의 숫자일 경우 '큰 수'
//     30~64 사이의 숫자일 경우 '중간 수'
//	   0~29 사이의 숫자일 경우 '작은 수' 라고 출력
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num >=65 && num <=100) {
			System.out.println("큰수");
		} else if(num>=30&&num<=64) {
			System.out.println("중간수");
		} else if(num>=0&&num<=29) {
			System.out.println("작은수");
		}
		
	}

}

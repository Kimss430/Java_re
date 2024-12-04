package Test4;

import java.util.Random;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 
//		큰 수 인지 아닌지 판별하기
//		(ex, 랜덤 수 : 35, 입력 수 : 40 일 경우 '입력한 수가 더 큽니다' 출력, 반대일 경우 작다고 출력)
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		for(;;) {
			int ranNum = ran.nextInt(100)+1;
			System.out.print("숫자를 입력하라");
			int scanNum = scan.nextInt();
			if(ranNum < scanNum) {
				System.out.println("랜덤 숫자 : " + ranNum + " 입력 숫자 : " + scanNum);
				System.out.println("입력한 수가 더 큽니다");
			} else {
				System.out.println("랜덤 숫자 : " + ranNum + " 입력 숫자 : " + scanNum);
				System.out.println("입력한 수가 더 작습니다");
			}
		}
	}

}

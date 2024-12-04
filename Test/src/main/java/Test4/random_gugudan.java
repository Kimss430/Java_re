package Test4;

import java.util.Random;
import java.util.Scanner;

public class random_gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 아래 이미지와 같이 결과를 출력하시오. 
//		(구구단 문제는 랜덤 숫자 2개 조합으로 출제 - 실행 시 문제가 계속 바뀌도록)
//		8 * 8 = 64
//		정답 !
//		2 * 8 = 15
//		오답 ! 정답은 : 16 입니다
//		""
//		""
//		5문제 풀이 끝!
//		20점 입니다! (한문제당 20점)
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int count = 0;
		for(int i = 1; i <=5; i++) {
			int x = ran.nextInt(8)+2;
			int y = ran.nextInt(9)+1;
			System.out.print(x + " * " + y + " = ");
			int correct = scan.nextInt();
			if(correct == (x*y)) {
				System.out.println("정답 !");
				count++;
			} else {
				System.out.println("오답 ! 정답은 : " + (x*y) + " 입니다");
			}
		}
		System.out.println(count*20 + "점 입니다! (한문제당 20점)" );
		
	}	

}

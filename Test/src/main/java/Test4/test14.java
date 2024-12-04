package Test4;

import java.util.Random;
import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7. 컴퓨터와 진행하는 가위바위보 게임을 작성하시오. 실행예시는 카페 참고.
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		for(;;) {
			System.out.print("가위(0), 바위(1), 보(2) 입력 : ");
			int choice = scan.nextInt();
			int comChoice = ran.nextInt(3)-1;
			if(choice < 0 || choice > 2) {
				System.out.println("다시 입력바람");
				continue;
			}
			if(choice == comChoice) {
				System.out.println("비겼습니다.");
			}
		}
	}

}

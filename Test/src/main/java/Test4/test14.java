package Test4;

import java.util.Random;
import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7. 컴퓨터와 진행하는 가위바위보 게임을 작성하시오. 실행예시는 카페 참고.
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String arr[] = {"가위", "바위", "보"};
		int winCnt = 0;
		int loseCnt = 0;
		
		while(true) {
			System.out.print("가위(0), 바위(1), 보(2) 입력 : ");
			int num = scan.nextInt();
			int comNum = ran.nextInt(3);
			System.out.println("Player : " + arr[num]);
			System.out.println("컴퓨터 : " + arr[comNum]);
			if(num == comNum) {
				System.out.println("비겼습니다.");
			} else if(num == 0 && comNum == 2) {
				System.out.println("Player Win");
				winCnt++;
			} else if(num == 2 && comNum == 0) {
				System.out.println("컴퓨터 Win");
				loseCnt++;
			} else {
				if(num > comNum) {
					System.out.println("Player Win");
					winCnt++;
				} else {
					System.out.println("컴퓨터 Win");
					loseCnt++;
				}
			}
			System.out.println("Player ==> " + winCnt + "승 " + loseCnt + "패");
			System.out.println("재대결(1), 종료(2)");
			int exit = scan.nextInt();
			if(exit == 2) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

}

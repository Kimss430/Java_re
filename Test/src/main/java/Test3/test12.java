package Test3;

import java.util.Random;
import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 아래 이미지와 같이 동작하도록 구현하시오.
//		문제수를 입력해주세요 : 3
//		6 * 8 = 48
//		정답.
//		4 * 9 = 3
//		오답. 정답은 36입니다.
//		2 * 1 = 2
//		정답.
//		총 3문제 중 2개 정답!
//		계속 하시려면 아무키를 입력해주세요. 종료는 0을 입력해주세요.
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		while (true) {
			System.out.print("문제수를 입력해주세요 : ");
			int count = scan.nextInt();
			int o = 0;
			for (int i = 1; i <= count; i++) {
				int x = ran.nextInt(8) + 2;
				int y = ran.nextInt(9) + 1;
				System.out.print(x + " * " + y + " = ");
				int correct = scan.nextInt();
				if (correct == (x * y)) {
					System.out.println("정답.");
					o++;
				} else {
					System.out.println("오답. 정답은 " + (x * y) + "입니다.");
				}
			}
			System.out.println("총 " + count + "문제 중 " + o + "개 정답!");
			System.out.println("계속 하시려면 아무키를 입력해주세요. 종료는 0을 입력해주세요.");
			int x = scan.nextInt();
			if(x == 0) {
				System.out.println("종료 되었습니다.");
				break;
			}
		}

	}

}

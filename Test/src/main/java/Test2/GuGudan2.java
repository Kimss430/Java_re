package Test2;

import java.util.Random;
import java.util.Scanner;

public class GuGudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int noCnt = 0;
		System.out.println("구구단 시작, -1 입력시 종료");
		while (true) {
			int num1 = ran.nextInt(8) + 2; // 2~9
			int num2 = ran.nextInt(9) + 1; // 1~9
			System.out.print(num1 + " * " + num2 + " = ");
			int answer = scan.nextInt();
			if (answer == -1) {
				System.out.println("종료 되었습니다.");
				break;
			} else if (num1 * num2 == answer) {
				System.out.println("정답!");
				cnt++;
			} else {
				System.out.println("오답 ! 정답은 " + (num1 * num2));
				noCnt++;
			}
		}
		System.out.println("문제풀이 끝!");
		System.out.println("정답 : " + cnt + "개, " + "오답 : " + noCnt + "개");
	}

}

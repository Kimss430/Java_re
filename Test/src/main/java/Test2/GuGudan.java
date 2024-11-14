package Test2;

import java.util.Random;
import java.util.Scanner;

public class GuGudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		ran.nextInt(10); // 0~9
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			int num1 = ran.nextInt(8) + 2; // 2~9
			int num2 = ran.nextInt(9) + 1; // 1~9
			System.out.print(num1 + " * " + num2 + " = ");
			int answer = scan.nextInt();
			if (num1 * num2 == answer) {
				System.out.println("정답!");
				cnt++;
			} else {
				System.out.println("오답 ! 정답은 " + (num1 * num2));
			}
		}
		System.out.println("문제풀이 끝!");
		System.out.println("점수는 " + (cnt * 20) + "점");

	}

}

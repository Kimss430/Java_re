package Test;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int i=1;
		int sum=0;
		while(true) {
			System.out.print(i + "번째 숫자 입력 : ");
			int num = scan.nextInt();
			if(num == -1) {
				break;
			}
			sum += num;
			i++;
		}
		System.out.println("숫자 " + (i-1) + "개의 합은" + sum + "입니다.");

	}

}

package Test4;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력
		
		Scanner scan = new Scanner(System.in);
		for(;;) {
			
			int x = scan.nextInt();
			int y = scan.nextInt();
			int sum = (x+y);
			if(sum > 10) {
				System.out.println("큰 수");
			} else {
				System.out.println("작은 수 ");
			}
		}
	}

}

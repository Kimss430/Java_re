package Test4;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 숫자를 하나 입력받고, 해당 숫자의 구구단 출력
//		(ex, 2입력시 2*1=2, 2*2=4, 2*3=6 ... 2*9=18 출력)
		Scanner scan = new Scanner(System.in);
		for(;;) {
			int x = scan.nextInt();
			for(int y = 1; y <= 9; y++) {
				System.out.println(x + " * " + y + " = " + x*y);
			}
		}
	}

}

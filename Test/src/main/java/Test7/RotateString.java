package Test7;

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // 문자열 입력받기
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();
        // 문자열 회전 후 출력
        for(int i = 0; i <= input.length(); i++) {
        	System.out.println(input.substring(i) + input.substring(0, i));
        }
        
	}

}

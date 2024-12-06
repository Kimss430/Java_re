package Test7;

import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.print(">>");
			String input = scan.nextLine();
			
			if(input.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			
			String[] word = input.trim().split("\\s+");
			System.out.println("어절 개수는 " + word.length);
			
		}
	}

}

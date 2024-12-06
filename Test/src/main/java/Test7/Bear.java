package Test7;

import java.util.Scanner;

public class Bear extends GameObject{

	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
        char input = scanner.next().charAt(0);

        switch (input) {
            case 'a': // 왼쪽
                x -= distance;
                if (x < 0) x = 0;
                break;
            case 's': // 아래
                y += distance;
                if (y >= 10) y = 9;
                break;
            case 'd': // 위
                y -= distance;
                if (y < 0) y = 0;
                break;
            case 'f': // 오른쪽
                x += distance;
                if (x >= 20) x = 19;
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
	}

	@Override
	protected char getShape() {
		// TODO Auto-generated method stub
		return 'B';
	}
	
	
	
}

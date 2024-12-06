package Test7;

public class Fish extends GameObject{

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move() {
		// TODO Auto-generated method stub
		
		 int direction = (int) (Math.random() * 4); // 0: 왼쪽, 1: 아래, 2: 위, 3: 오른쪽
	        int steps = (int) (Math.random() * 2) + 1; // 1~2칸 이동

	        switch (direction) {
	            case 0: // 왼쪽
	                x -= steps * distance;
	                if (x < 0) x = 0;
	                break;
	            case 1: // 아래
	                y += steps * distance;
	                if (y >= 10) y = 9;
	                break;
	            case 2: // 위
	                y -= steps * distance;
	                if (y < 0) y = 0;
	                break;
	            case 3: // 오른쪽
	                x += steps * distance;
	                if (x >= 20) x = 19;
	                break;
	        }
		
	}

	@Override
	protected char getShape() {
		// TODO Auto-generated method stub
		return 'F';
	}
	
}

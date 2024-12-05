package Test6;

public class PositivePoint extends Point{
	
	public PositivePoint(){
		super(0,0);
	}
	
	public PositivePoint(int x, int y) {
		super(0, 0);
		if(x > 0 && y > 0) {
			move(x, y);
		}
		
	}
	@Override
	protected void move(int x, int y) {
		if(x >= 0 && y >= 0) {
			super.move(x, y);
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() + ")의 점";
	}
}

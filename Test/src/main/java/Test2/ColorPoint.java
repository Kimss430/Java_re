package Test2;

public class ColorPoint extends Point {
	private String color;
	public ColorPoint() {
		super(0, 0);
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.color + "색의 " + "(" + getX() + "," + getY() + ")의 점";
	}

	
}

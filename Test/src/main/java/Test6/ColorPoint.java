package Test6;

public class ColorPoint extends Point {

	String color;

	ColorPoint() {
		this(0, 0, "BLACK");
		// super(0, 0)
		// this.color = "BLACK"
	}
	ColorPoint(int x, int y){
		this(x, y, "BLACK");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	void setXY(int x, int y) {
		move(x, y);

	}

	void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color + "색의" + "(" + getX() + "," + getY() + ")의 점";
	}
}

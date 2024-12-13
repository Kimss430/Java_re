package test10;

public class ColorPoint extends Point {

	String color;
	
	public ColorPoint() {
		this(0, 0, "BLACK");
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	void setXY(int x, int y) {
		super.move(x, y);
	}

	void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + "색의 (" + super.getX() + "," + super.getY() + ")의 점";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//		cp.setXY(10, 20);
//		cp.setColor("RED");
//		String str = cp.toString();
//		System.out.println(str + "입니다. ");

		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}

package Test6;

public class Point3D extends Point{
	int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	public void moveUp() {
		z++;
	}
	public void moveDown() {
		z--;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + super.getX() + "," + super.getY() + "," + z + ") 의 점";
	}
}

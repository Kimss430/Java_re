package Test2;

public class PointMain {

//	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//		cp.setXY(10, 20);
//		cp.setColor("RED");
//		String str = cp.toString();
//		System.out.println(str + "입니다. ");
//		// -------------------------------
//		
//	}
	// 결과: RED색의 (10,20)의 점입니다.

	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
	// 결과 : BLACK색의 (0,0) 점입니다.
	// RED색의 (5,5) 점입니다.

}

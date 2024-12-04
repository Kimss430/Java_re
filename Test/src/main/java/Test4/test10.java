package Test4;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3. 구구단을 하시오. 단, 2번째 오는 숫자를 거꾸로(9부터 1까지) 출력하시오.
//		예시) 2*9=18
//			 2*8=16
//			 ....
//			 2*1=2
//			 3*9=27
//			 3*8=24
//			 ..
//			 ..
//			 9*1=9 (마지막)
		for(int x = 2; x<=9; x++) {
			for(int y = 9; y>=1; y--) {
				System.out.println(x + "*" + y + "=" + x*y);
			}
		}
	}

}

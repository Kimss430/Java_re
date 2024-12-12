package array;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2. 4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 
//		임의의 위치에 삽입하라. 나머지 6개의 숫자는 모두 0이다. 
//		만들어진 2차원 배열을 화면에 출력하라. 
//		(중복 x, 나머지 6개는 0으로 출력)
		
		int intArray[][] = new int[4][4];
		
		int num = 0;
		while (num < 10) {
			int row = (int) (Math.random() * 4); // 0~3
			int col = (int) (Math.random() * 4); // 0~3

			if (intArray[row][col] != 0) {
				continue;
			} else {
				intArray[row][col] = ++num;
			}

		}

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();

		}
	}

}

package array;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		int num = 0;
		while(num < 9) {
			int row = (int) (Math.random() * 3);
			int col = (int) (Math.random() * 3);
			
			if(arr[row][col] != 0) {
				continue;
			} else {
				arr[row][col] = ++num;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2];
		}
		for(int i=0; i<arr.length; i++) {
			arr[3][i] = arr[0][i] + arr[1][i] + arr[2][i] + arr[3][i];
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

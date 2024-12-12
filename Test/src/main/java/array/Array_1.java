package array;

import java.util.Random;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[4][4];
		Random ran = new Random();
		
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(10)+1;
				System.out.print(arr[i][i] + "  ");
			}
			System.out.println();
		}
		
	}

}

package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1, 2, 3, 4, 5]
		
		int arr[] = new int[5];
		
		// 값을 입력받아서 배열에 채워넣기(5개)
		// 음수가 입력되면 저장하지 말고 다시 입력받기
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+ "번 쨰 숫자 입력 :");
			arr[i] = scan.nextInt();
			
			if(arr[i] < 0) {
				System.out.println("0보다 큰 수 입력하세요.");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

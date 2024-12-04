package Test3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 
//		정수 배열을 생성하고, 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라. 
//		배열에는 같은 수가 없도록 하고 배열을 출력하라
		Scanner scan = new Scanner(System.in);
		int size;
		for(;;) {
			size = scan.nextInt();
			if(size <= 100 && size > 0) {
				break;
			} 
			System.out.println("1~100까지만 입력");
		}
		
		int arr[] = new int[size];
		Random ran = new Random();
		for(int i = 0; i < arr.length; i++) {
			int num = ran.nextInt(100)+1;
			arr[i] = num;
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
				} // 중복숫자 가리기
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

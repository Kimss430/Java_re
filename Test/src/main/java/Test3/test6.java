package Test3;

import java.util.Arrays;
import java.util.Random;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		4. 6개의 공간을 가지는 배열을 생성하고, 랜덤하게 생성된 1부터 45사이의 값을 배열에 
//		넣으시오. 단, 중복 숫자는 허용하지 않음.
		
		int arr[] = new int[6];
		Random ran = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}

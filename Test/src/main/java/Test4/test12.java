package Test4;

import java.util.Arrays;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5. int arr[] = {3, 5, 1, 8, 2}
//		위 배열에서 가장 작은 숫자를 찾아서 맨 처음 위치의 숫자와 위치를 바꾸시오
		// 결과 : {1, 5, 3, 8, 2}
		
		int arr[] = {3, 5, 1, 8, 2};
		int minIndex = 0;
		for(int i =0; i < arr.length; i++) {
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		int temp = arr[minIndex];
		arr[minIndex] = arr[0];
		arr[0] = temp;
		System.out.println(Arrays.toString(arr));
	} 

}

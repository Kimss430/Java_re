package Test3;

import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		* 다음 배열을 기준으로 문제 풀이해보기
//
//		1. 가장 큰 수와 가장 작은 수의 위치 변경
//		(결과 : {3, 1, 2, 4, 5})
		
		int arr[] = {3, 5, 2, 4, 1};
		int maxIndex = 0;
		int minIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			} else if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
	}

}

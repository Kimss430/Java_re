package Test3;

import java.util.Arrays;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		* 다음 배열을 기준으로 문제 풀이해보기
//		3. 선택 정렬을 이용하여 마찬가지로 작은수 -> 큰 수 순으로 정렬
//		(결과 : {1, 2, 3, 4, 5})
		int arr[] = { 3, 5, 2, 4, 1 };

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

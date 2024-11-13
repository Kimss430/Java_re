package Test;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 5, 4, 3 };

		// 가장 큰 숫자와 가장 작은 숫자의 위치 변경
		// {2, 1, 5, 4, 3} -> {2, 5, 1, 4, 3}

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[max] < arr[i]) {
				max = i;
			} else if(arr[min] > arr[i]){
				min = i;
			}
		}
		int temp = arr[min];
		arr[min] = arr[max];
		arr[max] = temp;
		System.out.println(Arrays.toString(arr));
	}

}

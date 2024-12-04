package Test4;

import java.util.Arrays;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6. int arr[] = {3, 5, 1, 8, 2}
//		위 배열에서 3이상의 숫자들에 대한 평균 값을 구하시오.
		int arr[] = { 3, 5, 1, 8, 2 };
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 3) {
				sum += arr[i];
				count++;
			}
		}
		double average = (double)sum/count;
		System.out.println(average);
	}

}

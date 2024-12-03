package Test3;

import java.util.Arrays;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2.
//		해당 배열을 홀수, 짝수 따로 정렬하시오.
//		결과 예시 : {23, 25, 27, 61, 10, 16, 32, 54};
		int arr[] = { 10, 25, 32, 54, 23, 16, 27, 61 };
		int[] oddArr = new int[arr.length];
		int[] evenArr = new int[arr.length];
		int oddCount = 0;
		int evenCount = 0;

		// 홀수와 짝수 분리
		for (int num : arr) {
			if (num % 2 != 0) {
				oddArr[oddCount++] = num; // 홀수는 oddArr에 저장
			} else {
				evenArr[evenCount++] = num; // 짝수는 evenArr에 저장
			}
		}

		// 홀수와 짝수 배열을 각각 정렬
		Arrays.sort(oddArr, 0, oddCount);
		Arrays.sort(evenArr, 0, evenCount);

        // 결과 배열에 홀수 먼저, 짝수 뒤에 병합
        int index = 0;
        for (int i = 0; i < oddCount; i++) {
            arr[index++] = oddArr[i]; // 홀수 배열을 arr에 복사
        }
        for (int i = 0; i < evenCount; i++) {
            arr[index++] = evenArr[i]; // 짝수 배열을 arr에 복사
        }


		// 결과 출력
		System.out.println(Arrays.toString(arr));
	}

}
